# Book-Store-Inventory-and-Library-Management-System
Designed an end to end book store inventory system to perform CRUD operations on Books and Users (Staff, Vendors). Functionalities include search books, placing order, categorized membership package with invoice-generation, stock updating. Querying database for generation of statistical reports, viewing transaction history, order  requests. Additional library management allowing issue/return of Books(members), charging late fines and readers’ zone.

The entire execution of the project starts from BookInventoryLibraryManagementSystem class abd the entire system will be handled by the Admin only. The first page has the login/Signup options available.

Signup :

Enter admin ID as provided by shop owner/any other official id .

The username should be unique. If a username exists in the system from beforehand a warning will be shown to change the username.

Name, email id and phone number, password, and answer to security question should be provided in the specified/default format otherwise warning will be displayed.

Once the user has registered with the system, he/she can log in using the username and password.

Forget password: If someone forgets the password one can click on forget password and change the existing password and then again login to the system with the new password.

The admin page will open up with a greeting and Admin’s name along with various other options will be available in the menu bar.
1.	Admin : 

Admin can view, update and delete a particular account.

2.	Book:

Add: Admin can add books with all the details in the specified/default format otherwise warning will be displayed.

View: Admin can view, update and delete books.

Search: Admin can search books either by writing the name of the book or a part of the name, the system will show all the books starting with that name or having a part of that name. Admin can also select any genre that will automatically get updated every time a book is being added with a specific genre and search books with ease.

Request Orders: Admin can place book orders to all the vendors available/associated with this book shop. The vendor list will automatically get updated every time a vendor is added to the system. Admin can also check whether a book is already requested or not. Apart from this admin can update and delete specific orders.

3.	Member: 

Buy Membership: Admin adds all details of a customer who wants to become a member of the shop with a specified package and generates a one-time membership id for the customer.

View Members: Admin can view, update and delete the member details and not the package details.

View Issued Books: Admin can provide a membership id and view all the books issued by the member(active issues).

4.	Buy Books:

General: Add the ISBN of the book. On clicking view it will show all the details of the book if stock is available else it will show “Stock Unavailable”. If the customer asks for a particular book that has supposed 100 stocks available but the customer asks for 150 copies of that book the system will show a message displaying the total number of stocks available in the system ie. 100. Add the phone number of the customer and check if the customer has previously purchased a book or not. If the customer is present in the database automatically the details will be displayed. Click on generate bill to generate a bill with shop information, time of purchase, name of customer, phone number, and the details of books purchased. Calculate the total and print the bill.

Member: The work will be the same as before with some changes. Here provide the membership id to fetch all the details of the member. Check whether the membership has expired or not. For current members, discounts are applied based on their membership package.

NOTE: All stocks are updated automatically when a member/customer buys a book, or when the admin adds or updates book stocks.

Apart from selling books, this shop provides an additional library space allowing members and general customers to read books in the library. It allows all its existing members to issue, return and renew books.

5.	Issue: 

Only members can issue and return books.
Provide ISBN no. And check whether stocks are available or not. Provide membership id and check whether the membership has expired or not. If the member has already issued the book, the system will show a message that the member has already issued that book. If the member has already issued 6 books the system will not allow issuing more books. The number of books issued to a member is automatically updated when a member issue or returns a book.

6.	Return: 

Provide the membership id and the system will show all the books that are being issued to the member. Select the book the members want to return. The system will show if the book is returned within the due date or not and show the number of days late. Select the state of the book i.e. damaged or not. Calculate the fine amount. If the member has no books issued the system will display a message.

7.	Reader:

The readers' zone is for both general customers and members. Members can read books for any number of hours and are not charged for it except if they damage the book. General customers have to pay some minimal charges on per hour basis. Provide member id to fetch the details of members. Provide the phone number of general customers to check if the details are already in the database or not and so on.

8.	Staff Members:

Add: Add staff members with their designation, salary, and other basic details.

View: View, update and delete details of any staff members.

9.	Vendors:

Add: Add vendors with all details.

View: View, update and delete vendor details. View all the book orders that are placed to a vendor.

10.	Sales:

Admin can check the sales for any specific date, any year, or a particular month and year.

Sales will show the total amount received by the shop for membership packages, selling books to members and general customers, fines collected, and also charge per hour from readers(general customers).

The total amount will be displayed for each option selected.

11.	History:

It shows all the book details that are in the database, staff details, vendors, orders, readers history, books sold to members and general customers, memberships, active issued books, all books that are issued and returned and lastly return history.

It also displays the cumulative costs in the last column.

12.	Logout will close the admin page and bring back to the first screen of signup /login.


               

