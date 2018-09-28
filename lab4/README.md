|---------------------------------------| |---------------------------------------------|
|					| |						|
| Reservation				| | Reservation Manager				|
| -------------------------------------	| | -------------------------------		|
| Responsibilities:			| | Responsibilities:				|
|  - Tracks name			| |  - Creates Reservations			|
|  - Tracks cell number			| |  - Deletes Reservations			|
|  - Tracks number of people		| |  - Notifies Table Manager of new Reservation|
|  - Tracks time of reservation		| |  - Notifies WaitList table is available	|
|					| |						|
| Collaborators:			| | Collaborators:				|
|  - Reservation Manager		| |  - Reservation				|
|					| |  - Table Manager		 		|
|					| |  - WaitList					|
|					| |						|
|---------------------------------------| |---------------------------------------------|

|---------------------------------------| |---------------------------------------------|
|                                       | |						|
| Table                                 | | Table Manager				|
| ------------------------------------- | | ------------------------------------	|
| Responsibilities:                     | | Responsibilities:				|
|  - Tracks table number		| |  - Creates Tables				|
|  - Tracks number of seats             | |  - Deletes Tables				|
|  - Tracks availability	     	| |  - Notifies Reservation Manager availability|
|			                | |						|
|					| |						|
| Collaborators:                        | | Collaborators:      			|
|  - Table Manager                      | |  - Reservation Manager			|
|                                       | |  - Table					|
|                                       | |						|
|                                       | |						|
|---------------------------------------| |---------------------------------------------|

|---------------------------------------| |---------------------------------------------|
|                                       | |						|
| WaitList                   		| | Restaurant Manager				|
| ------------------------------------- | | ----------------------			|
| Responsibilities:                     | | Responsibilities:				|
|  - Receives new Reservation from app	| |  - Notify Table Manager table is ready 	|
|  - Tells Reservation Manager to add	| |  - Notify Table Manager table is occupied	|
|    a reservation			| |  						|
|  - Notifies app of available table	| |						|
|    	                 		| |						|
|                                       | |						|
| Collaborators:                        | | Collaborators:				|
|  - Reservation Manager                | |  - Table Manager				|
|  - Table Manager                      | |						|
|                                       | |						|
|                                       | |						|
|---------------------------------------| |---------------------------------------------|
