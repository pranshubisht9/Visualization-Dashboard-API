**Spring Boot REST API Documentation** 

**API Name:** Visualization Dashboard REST API 

**Description:** The Visualization Dashboard REST API provides a set of endpoints for accessing data from a MySQL database that can be used to create visualizations on the frontend. The API is designed to be simple and easy to use, and allows users to retrieve data in a variety of formats, including JSON. 

**Contact Information:**  

**Developer:** Pranshu Singh Bisht **Email:[ pranshubisht9@gmail.com ](mailto:pranshubisht9@gmail.com)Mobile No:** 7522023037 

*If you have any questions or need support with the Visualization Dashboard REST API, please contact me.* 


**End Year Filter** 

Returns array of object json data. 

- **URL** 

/dashboard/end-year/{value}  

- **Method:** 

GET

- **URL Path Variable** 

**Required:** 

value=[integer]

- **Success Response:** 
- **Code:** 200  
- **Content:** [{..}, {..}, {..}]
- **Error Response:** 
- **Code:** 404 NOT FOUND   
- **Content:** {"timestamp": "DATETIMESTAMP", "message": "No data found with endyear: [value]", "details": "uri=/dashboard/end-year"}
- **Sample Call:** fetch('https://localhost:8888/dashboard/end-year/2023')   .then(response => response.json()) 

`  `.then(data => { 

`    `console.log(data); 

`  `}) 

`  `.catch(error => { 

`    `console.error(error); 

`  `}); 

*EndPoint-2*

**Topic Filter** 

Returns array of object json data. 

- **URL** 

/dashboard/topic/?keyword={value} 

- **Method:** 

GET

- **URL Params** 

**Required:** 

topic=[string]

- **Success Response:** 
  - **Code:** 200  **Content:** [{..}, {..}, {..}]
- **Error Response:** 
- **Code:** 404 NOT FOUND  
- **Content:** {"timestamp": "DATETIMESTAMP", "message": "No data found with filter: [value]", "details": "uri=/dashboard/filter"}
- **Sample Call:** fetch('https://localhost:8888/dashboard/topic?keyword=travel')   .then(response => response.json()) 

`  `.then(data => { 

`    `console.log(data); 

`  `}) 

`  `.catch(error => { 

`    `console.error(error); 

**Sector Filter** 

Returns json data about a single user. 

- **URL** 

/dashboard/sector/?keyword={value} 

- **Method:** 

GET

- **URL Params** 

**Required:** 

value=[string]

- **Success Response:** 
  - **Code:** 200  **Content:** [{..}, {..}, {..}]
- **Error Response:** 
- **Code:** 404 NOT FOUND  
- **Content:** {"timestamp": "DATETIMESTAMP", "message": "No data found with sector: [value]", "details": "uri=/dashboard/sector"} 
- **Sample Call:** fetch('https://localhost:8888/dashboard/sector?keyword=Pharmaceuticals') .then(response => response.json()) 

` `.then(data => { 

` `console.log(data); 

`  `}) 

`  `.catch(error => { 

**Region Filter** 

Returns array of object json data. 

- **URL** 

/dashboard/region?keyword={value} 

- **Method:** 

GET

- **URL Params** 

**Required:** 

value=[string]

- **Success Response:** 
  - **Code:** 200  **Content:** [{..}, {..}, {..}]
- **Error Response:** 
- **Code:** 404 NOT FOUND   
- **Content:** {"timestamp": "DATETIMESTAMP", "message": "No data found with region: [value]", "details": "uri=/dashboard/region"} 
- **Sample Call:** fetch('https://localhost:8888/dashboard/region?keyword = Asia') .then(response => response.json()) 

.then(data => { 

console.log(data); 

`  `}) 

.catch(error => { 

console.error(error);  }); 
***EndPoint-5***

**Pestle Filter** 

Returns array of object json data. 

- **URL** 

/dashboard/pestle?keyword={value} 

- **Method:** 

GET

- **URL Params** 

**Required:** 

id=[string]

- **Success Response:** 
  - **Code:** 200  **Content:** [{..}, {..}, {..}]
- **Error Response:** 
- **Code:** 404 NOT FOUND   
- **Content:** {"timestamp": "DATETIMESTAMP", "message": "No data found with pestle: [value]", "details": "uri=/dashboard/prestle"}
- **Sample Call:** fetch('https://localhost:8888/dashboard/pestle?keyword=Healthcare') .then(response => response.json()) 

.then(data => { 

console.log(data); 

`  `}) 

.catch(error => { 

console.error(error);  }); 
*EndPoint-6*

**Source Filter** 

Returns array of object json data. 

- **URL** 

/dashboard/source?keyword={value} 

- **Method:** 

GET

- **URL Params** 

**Required:** 

value=[string]

- **Success Response:** 
  - **Code:** 200  **Content:** [{..}, {..}, {..}]
- **Error Response:** 
- **Code:** 404 NOT FOUND   
- **Content:** {"timestamp": "DATETIMESTAMP", "message": "No data found with source: [value]", "details": "uri=/dashboard/source"} 
- **Sample Call:** fetch('https://localhost:8888/dashboard/source?keyword=infosysblogs') .then(response => response.json()) 

.then(data => { 

console.log(data); 

`  `}) 

.catch(error => { console.error(error);  }); 
*EndPoint-7*

**Swot Filter** 

Returns array of object json data. 

- **URL** /dashboard/swot/keyword={value} 
- **Method:** 

GET

- **URL Params** 

**Required:** 

value=[integer]

- **Success Response:** 
  - **Code:** 200  **Content:** [{..}, {..}, {..}]
- **Error Response:** 
- **Code:** 404 NOT FOUND   
- **Content:** {"timestamp": "DATETIMESTAMP", "message": "No data found with swot: [value]", "details": "uri=/dashboard/swot"}
- **Sample Call:** fetch('https://localhost:8888/dashboard/swot?keyword=Strength') .then(response => response.json()) 

.then(data => { 

console.log(data); 

`  `}) 

.catch(error => { 

console.error(error); 

` `}); 
*EndPoint-8*

**Country Filter** 

Returns array of object json data. 

- **URL** 

/dashboard/country?keyword={value} 

- **Method:** 

GET

- **URL Params** 

**Required:** 

id=[integer]

- **Success Response:** 
  - **Code:** 200  **Content:** [{..}, {..}, {..}]
- **Error Response:** 
- **Code:** 404 NOT FOUND   
- **Content:** {"timestamp": "DATETIMESTAMP", "message": "No data found with country: [value]", "details": "uri=/dashboard/country"} 
- **Sample Call:** fetch('https://localhost:8888/dashboard/country?keyword=India) .then(response => response.json()) 

.then(data => { 

console.log(data); 

`  `}) 

.catch(error => { console.error(error);  }); 

*EndPoint-9*

**City Filter** 

Returns array of object json data. 

- **URL** 

/dashboard/topic/?keyword={value} 

- **Method:** 

GET

- **URL Params** 

**Required:** 

id=[integer]

- **Success Response:** 
  - **Code:** 200  **Content:** [{..}, {..}, {..}]
- **Error Response:** 
- **Code:** 404 NOT FOUND   
- **Content:** {"timestamp": "DATETIMESTAMP", "message": "No data found with city: [value]", "details": "uri=/dashboard/city"} 
- **Sample Call:** fetch('https://localhost:8888/dashboard/city?keyword=lucknow') .then(response => response.json()) 

.then(data => { 

console.log(data); 

`  `}) 
.catch(error => { console.error(error);  }); 
