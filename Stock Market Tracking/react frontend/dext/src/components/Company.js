import React,{Component} from 'react';
import { cover } from '../store/cover.js'
import {lin} from '../linking/lin.js';

class Company extends Component{
    constructor(props){
        super(props)
        this.state ={
            data:{}
           
        }
    }
    
   
    componentDidMount(){
      

       cover.latestPrice(this.props.ticker)
       .then((data) =>{ 
            console.log(data);
            this.setState({
            data:data[data.length-1],
            name:this.props.ticker,
            high:data[data.length-1].high,
            low:data[data.length-1].low,
            close:data[data.length-1].close

            
        })
    })
       
    }


    async postData(name,high,low,close){
        try{
            
            //use  http://localhost:8765/Stock/enter  to send data backend

            let result = await fetch('https://webhook.site/07c06a37-8d98-425f-8c31-f754534a34e1',{
                method: 'post',
                mode:'no-cors',
                headers:{
                    'Accept':'application/json',
                    'Content-type':'application/json',
                },
                body:JSON.stringify({
                    name,high,low,close

                })
 
            });
            console.log('result'+result)

           

        }catch(e){
            console.log(e)
        }
    }
    render(){
        return(
            
            <tr>
                <td>{this.props.ticker}</td>
                <td>{this.state.data.high}</td>
                <td>{this.state.data.low}</td>
                <td>{this.state.data.close}</td>
                <button onClick={()=>this.postData(this.props.ticker,this.state.data.high,this.state.data.low,this.state.data.close)}>press</button>

            </tr>
            
        )
    }
    
}
export default Company;