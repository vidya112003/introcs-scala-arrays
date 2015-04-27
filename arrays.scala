import scala.math.min

object arrays {

  

  def arraySize(a: Array[Int]): Int = {
    a.length
  }

  def getIntsAsString(label: String, delimiter: String, a: Array[Int]): String = {
    val length=arraySize(a)
	var result=label
	if(a==Array()){
		 result
	}
	else{
		result+=""
		for(b<-0 to a.length-1){
			result+=a{b}
			if(a{b}!=a(a.length-1)){
				result+=delimiter
			}
		}
		result
	}
  }
  
  def readFileIntoArray(filename: String, a: Array[Int]) {
         def readFileIntoArray(filename: String, a: Array[Int]) {
		var elNumero=0
		for (line <- Source.fromFile(filename).getLines()) {
			if(arraySize(a)!=elNumero){
			 a(elNumero)=line.toInt
			 elNumero+=1
		}
	}	
  }
  

  
  def minimum(a: Array[Int]): Int = {
    require(a.length > 0) 
    var min=a(0)
		var index=0
		for(i<- a){
			if(i!=a(0)){
				if(i<a(index)){
					min=i
				}
				index=index+1
			}
		}
		min		
  }
    
  def countEven(a: Array[Int]): Int = {
     var evenNumberTracker=0
		for(i<-a){
			if(i%2==0){
				evenNumberTracker+=1
			}
		}
		evenNumberTracker
  }

  
  
  def countOdd(a: Array[Int]): Int = {
    var oddNumberTracker=0
		for(i<-a){
			if(i%2!=0){
				oddNumberTracker+=1
			}
		}
		oddNumberTracker
  }
  

  
  def pairwiseAdd(a: Array[Int], b: Array[Int], c: Array[Int]) {
      var indexTracker=0
	  var thingToReturn=""
		while(indexTracker!=a.length){
		c{indexTracker}=a{indexTracker}+b{indexTracker}
		indexTracker+=1
		}
		thingToReturn+="{"
		for(z<-0 to c.length-1){
			thingToReturn+=(c(z))
			if(z!=2){
				thingToReturn+=","
			}
		}
		thingToReturn+="}"
	  	thingToReturn
  }
  
  def newPairwiseAdd(a: Array[Int], b: Array[Int]): Array[Int] = {
    val addSize = min(a.length, b.length)
    val newArray = Array.fill(addSize)(0)

    var indexTracker=0
		while(indexTracker!=a.length){
			newArray{indexTracker}=a{indexTracker}+b{indexTracker}
			indexTracker=indexTracker+1
        }
    newArray
  }
  
  def isAscending(a: Array[Int]): Boolean = {
      var flag=1
	    
		for(b<-0 to a.length-2){
			if(a(b)<=a(b+1)){
				if(flag==1){
					flag=1
				}
			}
			else{
				flag=0
			}
		}
		if(flag==1){
			 true
		}
		else{
			 false
		}
	   
  }

  

  def getAscendingRun(a: Array[Int], position: Int): Int = {
    require(position < a.length)
    var boomerang=0;
	var numToCompare=a(position)
	var alreadyFound="not found"
	for(b<-position to a.length-1){
		if((a(b)<numToCompare)&&(alreadyFound!="found")){
			if(b!=a.length){
				boomerang=b
				alreadyFound="found"
			}
		 }
		   
		  numToCompare=a(b)
	  }
	  if(boomerang==0){
		  boomerang=a.length
	}
	  boomerang
   
  }
    

  

  def getRunsAsString(a: Array[Int]): String = {
    var baseball=""
	  var iterator=0
	  var currIndex=0
	  var x=0
	  var incrementer=0
	  var position=0
	  var secondIncrementer=0
	  while(iterator!=a.length){
		  currIndex=getAscendingRun(a,position)
		  for(b<-position to currIndex-1){
			  incrementer+=1
			  baseball+=a(b)
			  if(b!=currIndex-1){
				  baseball+=", "
			  }
		  }
		  baseball+=" | "
		  position=currIndex
		  iterator=getAscendingRun(a,position)
	
		  }
	  for(c<-incrementer to a.length-1){
		   if(x==1){
			  baseball+=", "
		  }
		  baseball+=a(c)
		  
		  x+=1
	  }
	  baseball
  }
   
}
