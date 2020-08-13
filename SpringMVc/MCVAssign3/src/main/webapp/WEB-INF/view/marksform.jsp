<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div class="container mt-5">
		 <form action="processform" method="post">
    	 <div class="form-group">
    	  <label for="science">science</label>
   		  <input type="number"
   		   class="form-control"
   		   id="science"
   		   name="science"
   		    >
      </div>
    
    	<div class="form-group">
    	 <label for="maths">maths</label>
   		 <input type="number"
   		  class="form-control"
   		  id="maths"
   		  name="maths"
   		  >
      </div>
    
		<div class="form-group">
    	 <label for="english">English</label>
   		 <input type="number" 
   		 class="form-control" 
   		 id="english" 
   		 aria-describedby="Enter here"
   		 name="english">
      </div>
	<div class="container text-center">
	<button type="submit" class="btn btn-success">Sign Up</button>
    </div>
    </form>
      
   </div> 

</body>
</html>