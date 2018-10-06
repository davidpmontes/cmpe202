1. CRC Cards

---------------------------------------------

Reservation

Responsibilities:
Tracks name,
Tracks cell number,
Tracks number of people,
Tracks time of reservation

Collaborators:
Reservation Manager

---------------------------------------------

Reservation Manager
  
Responsibilities:
Creates Reservations,
Deletes Reservations,
Notifies Table Manager of new Reservation,
Notifies WaitList table is available

Collaborators:
Reservation,
Table Manager,
WaitList

----------------------------------------------

Table

Responsibilities:
Tracks table number,
Tracks number of seats,
Tracks availability

Collaborators:
Table Manager

-----------------------------------------------

Table Manager

Responsibilities:
Creates Tables,
Deletes Tables,
Notifies Reservation Manager of availability

Collaborators:
Reservation Manager,
Table

-----------------------------------------------

WaitList

Responsibilities:
Receives new Reservation from app,
Tells Reservation Manager to add a reservation,
Notifies app of available table

Collaborators:
Reservation Manager

------------------------------------------------

Restaurant Manager

Responsibilities:
Notify Table Manager table is ready,
Notify Table Manager table is occupied

Collaborators:
Table Manager

------------------------------------------------

2. Design Patterns
   I will use the Singleton Pattern.  The WaitList, Reservation Manager, Table Manager
   and Restaurant Manager will be limited to single objects. There should only be one
   of each object because there is no benefit from having multiple copies of them.
