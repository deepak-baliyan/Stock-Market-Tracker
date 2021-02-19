import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Company from './components/Company.js';
import { useState } from 'react';


function App() {
  

 const refresh=()=>{
  window.location.reload();
 }

  return (
    <div className="App">
      <div className="container">
        <table className="table mt-5">
          <thead>
            <tr>
              <th>Ticker</th>
              <th>high price</th>
              <th>low price</th>
              <th>close price</th>
            </tr>
          </thead>
          <tbody>
            <Company ticker="aapl" />
            <Company ticker="goog"/>
            <Company ticker="msft"/>
            <Company ticker="tsla"/>

          </tbody>
          
        </table>
        
      </div>
      <button onClick={refresh}>Refresh</button>
    </div>
  );
}

export default App;
