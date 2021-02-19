import { lin } from '../linking/lin.js';

export const cover = {

    latestPrice: (ticker) => {
       const url= `${lin.base_url}/stock/${ticker}/intraday-prices?chartLast=1&token=${lin.api_token}`
        
       const query=fetch(url).then((response) => response.json())

       

     

        return query;
    }
}
    
    
