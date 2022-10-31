package day08_ternarySwitch;

public class HTTP {
    public static void main(String[] args) {

        int statusCode = 201;
        String result = (statusCode == 200) ? "ok" : (statusCode == 201) ? "Created" : "Accepted";

        System.out.println(result);

        System.out.println("--------------------------------------");

        /*
        8. HTTP is the protocol that governs communications between web-servers and web clients.
    Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

        Solution 1: Must use ternary
		Solution 2:	MUST use switch statement


9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

         */
    }
}
