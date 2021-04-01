package com.scjppreparation.basics.modifiers;

public class Synchronized {
	
	
	//we cant apply this for members and class
	//this modifier is only applicable for methods and blocks
	
	
	//if a  mehtod or block is declared as synchronized then at a time only one thread is allowed to execute on that to operate in the given object
	
	//advantage is we can resolbve data inconsistency problems
	
	
	//disadvanatage is increases the waiting time of the threads and effects performance of the system
	
	
	//transcient
	
	//at teh time of serailization if we dont want to save the value of a particular variable then we should go fo rtranscient key word
	//at teh time of serializartion jvm ignores the original value of seriailization and the default value is stored
	
	
	//volatile
	//value of the variable keeps ion changing 
	//then we should go for volatile
	//if a va raible declared as volatile then e=for every thread a separrate local copy will be created
	//every intermediate modification performed by that thread will takes place in local copy instead odf master copy
	
	//once the local copy value got finalised just before terminating the thread teh amster copy will be updated with the local state variable
	
	//teh modifier applicable only for variables are volatile and transcient
	
	//the modifiers applicable only for methods are su=ynchronized and native
	

}
