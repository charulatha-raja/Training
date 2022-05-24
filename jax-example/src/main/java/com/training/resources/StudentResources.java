package com.training.resources;

import java.util.List;

import com.training.model.Student;
import com.training.services.StudentService;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/Students")

public class StudentResources {
	
	private static StudentService service=new StudentService();
	
	
   
    public StudentResources() {
		super();
		// TODO Auto-generated constructor stub
	}


 @GET
 @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAllStudent() {
   return this.service.getAll();
  }
    
    
    
@GET
   @Path("/{rollNumber}")
   @Produces(MediaType.APPLICATION_JSON)
   public Response findById(@PathParam("rollNumber")int id) 
{
	try
	{
		Student entity = service.findById(id)
				.orElseThrow(()-> new RuntimeException("id not found"));
		return Response.ok(entity).build();
	}
	catch(RuntimeException e)
	{
		e.printStackTrace();
	
 	   return Response.ok("id not found").status(400).build();
	}
 	   }
    
   
   
   @DELETE
   @Path("/{rollNumber}")
   @Produces(MediaType.APPLICATION_JSON)
   public boolean remove(@PathParam("rollNumber")int id)
   {
	   return this.service.remove(id);

    }
  
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  
  public Response add( Student student)
  {
  boolean result=  this.service.add(student);
  
  if(result) 
  {
	  return Response.ok(student).status(201).build();
	 
  }
  else 
  {
	  return Response.status(400,"Not created").build();
  }
  
  }
 	  
	@PUT
 	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
 		public Student updateById(@PathParam("rollNumber")  int id , Student newStudent)
		{
			return service.update(id,newStudent);
	}
  


//	   @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Student getStudent() {
// 	   Student vijay = new Student(10,"vijay",99);
// 	   return vijay;
//    }
}


