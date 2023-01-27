/* problem1: Create a view called "firstname_lastname" in problem1.sql from the site_user table 
that only has the firstname and lastname columns.
         * NOTE: This table should NOT have the id and age.

So the syntax for creating the 'steve table' table above would be:
 * CREATE VIEW stevesview AS SELECT * FROM site_user WHERE firstname = 'Steve';
*/

Create View firstname_lastname As Select firstname, lastname From site_user;
