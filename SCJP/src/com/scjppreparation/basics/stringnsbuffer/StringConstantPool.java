package com.scjppreparation.basics.stringnsbuffer;

public class StringConstantPool {
	
	
	
	//in our program if any string object required to use repeatedly it is not recommended to created a separate object for every 
	
	//requirement. this appproach reduces performance and memory utilization
	
	//we can resolve this problem by creating 	only one object and share teh same object with all required references
	
	//this approach improves memory utilization and performance problems. we can achieve this by using string contant pool
	
	//in scp a single object will be shared for all required references. hence the main advantage of scp are memory utilization 
	
	//perfromance will be improved
	
	//but the problem in this approach is as several references pointing to sam e object by using one reference, if we are perfroming
	
	//any change to the object then all teh remaining references will be impacted
	
	//to resovle this sun people introduced Strign objects as immutables
	
	//according ot that once we created a string object we cannot perfrom any change in the strign oject , if we are trying to perfrom any
	
	//change sa new object will be created so that there is no effect on remaining references
	
	//hence the main disadvantage of sccp is we should ocmpulsory maintain steitntg objects as immutable
	
	
	
	//why String objects are immutable and String buffer objects are mutable ??
	
	//in teh ccase of string several references can point to the same object. by using one reference if we are performing any change in 
	
	//existing object the remaining references will be impacted. to resolve these problems sun people introdiced string objects as immutabel
	
	
	
	//according to these if once we created a strign object then we cannot perform any chages to it. . if we are trying to perform
	
	//any changes with those chages a new object will be created. scp is the only reason why string objects are immutable
	
	
	//but in the caseof strign buffer for every requirement compulsory a new object will be created	, reusing the same string buffer object
	
	//there is no chance. in one string buffer object if we are perforing any change there is no impact on the remaining references.
	
	//hence we can perfrom any changes in teh string buffer object then strign buffer objects are mutable
	
	
	//once we rceate a strign object we cant perfrom any changes in teh existing object(these object is created in scp area)
	
	//if we are trying to perform any change with those changes a new object will be created on teh heap. because of our run time
	
	//method call if there is a change in content then only a new object will be created
	
	//if there are no changes in the existing object then only those objects are reused

}
