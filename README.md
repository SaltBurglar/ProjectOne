# Project One - Expense Reimbursement System

## Project Description
The Expense Reimbursement System (ERS) will manage the process of reimbursing employees for expenses incurred while on company time. All employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. Finance managers can log in and view all reimbursement requests and past history for all employees in the company. Finance managers are authorized to approve and deny requests for expense reimbursement.

## Technologies Used

* Java Version 11
* HTML5/CSS
* Javascript
* JavaEE
* Spring Boot
* Maven

## Features

Expense Reimbursement System supports the following features:
Single login page that handles two types of users: Employee, and Finance Manager.

* An Employee can submit reimbursements.

* An Employee can view all of the reimbursements they submitted, and check their status.

* A Finance Manager can view reimbursements by status.

* Through Radio buttons on a table, they can select pending reimbursements.

* With a reimbursement selected, a Finance Manager may deny or approve it.

* Input validation through JavaScript when submissions, approvals, or denial is attempted.

To-do list:
  * Improve Color Schema so it isn't so drab


## Getting Started
   
  To get started, simply use the git clone command:
  https://github.com/SaltBurglar/ProjectOne.git

   A connection to a database needs to be implemented under the DatabaseConnection.java file.
   Apache Tomcat needs to also be changed to port 9001 for the project.
   In your webpage, access to the project by going to localhost:9001/ProjectOne/ in your browser.

## Usage
   
   There are two types of account: Employee and Finance Manager. For all administrative purposes, use an Finance Manager account.
   You will need to implement your own database based on the model structures included in the project.

## Contributors

> David Dominguez (@SaltBurglar)

## License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE
