window.onload = function(){ //this is essentially a callback function for the window's completion signal
    selectAllReimbursementsByThisUser();
}

function selectAllReimbursementsByThisUser(){
 
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function(){ // This step is second last. We are only setting up here before calling it later.

        if(xhttp.readyState==4 && xhttp.status ==200){
            clearDOM();
            let query = JSON.parse(xhttp.responseText);
            myDOM(query);
        }
    }
    xhttp.open('GET', 'http://localhost:9001/ProjectOne/employee/past_tickets');

    xhttp.send();
}

function myDOM(query){

    for (let i = 0; i < query.length; i++){
        //step 1: creaitng our new elements
        let newTR = document.createElement("tr");
        let newTH = document.createElement("th");

        let newTD1 = document.createElement("td");
        let newTD2 = document.createElement("td");
        let newTD3 = document.createElement("td");
        let newTD4 = document.createElement("td");
        let newTD5 = document.createElement("td");
        let newTD6 = document.createElement("td");


        //step 2: populate our creations
        newTH.setAttribute("scope", "row");
        let myTextH = document.createTextNode(query[i].id);
        let myTextD1 = document.createTextNode(query[i].amount);
        let myTextD2 = document.createTextNode(query[i].timeSubmitted)
        let myTextD3 = document.createTextNode(query[i].description)
        let myTextD4 = document.createTextNode(query[i].author)
        let myTextD5 = document.createTextNode(query[i].statusId)
        let myTextD6 = document.createTextNode(query[i].typeId)

        //all appending
        newTH.appendChild(myTextH);
        newTD1.appendChild(myTextD1);
        newTD2.appendChild(myTextD2);
        newTD3.appendChild(myTextD3);
        newTD4.appendChild(myTextD4);
        newTD5.appendChild(myTextD5);
        newTD6.appendChild(myTextD6);

        newTR.appendChild(newTH);
        newTR.appendChild(newTD1);
        newTR.appendChild(newTD2);
        newTR.appendChild(newTD3);
        newTR.appendChild(newTD4);
        newTR.appendChild(newTD5);
        newTR.appendChild(newTD6);

        let newSelection = document.querySelector("#myTableBody");
        newSelection.appendChild(newTR);
        }
    }


function clearDOM(){
    document.querySelector("#myTableBody").innerHTML = ""; 
}