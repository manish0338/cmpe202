## 1. CRC cards

### Restaurant
Responsibility | Collaborator 
--- | --- 
knows list of all tables	| Table
allocates table | 
deallocates table | 

### Table
Responsibility | Collaborator 
--- | --- 
knows table number | 
knows capacity | 
knows allocation status(occupied/vacant) | 


### Broker	
Responsibility | Collaborator 
--- | --- 
knows list of waiting customers	| Restaurant 
adds new customer to waitlist	| Customer
ask customer to confirm or cancel table	
ask restaurant to allocate table after SMS confirmation	
	
### Customer	
Responsibility | Collaborator 
--- | --- 
Knows customer name	| SignUp 
signup	| Confirm 
confirm table	| Cancel 
cancel table	

### Signup	
Responsibility |	Collaborator 
--- | --- 
knows party size	| 
knows mobile number	| 
	
### Confirm	
Responsibility |	Collaborator
--- | --- 
provides confirmation	
	
### Cancel	
Responsibility	| Collaborator
--- | --- 
provides cancellation	


## 2. Pattern used - command pattern
In command patern command is wrapped under object.
Broker looks for appropriate object which can handle command.
In this case signup , confirm and cancel are commands customer can perform.
Broker routes signup to waitlist and passes confirmation or cancellation to restaurant for processing.
Broker also maitains list(queue) of commands from all customers and processes them once at least one table becomes vacant.
