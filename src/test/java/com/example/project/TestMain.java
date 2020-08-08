package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TestMain {

   @Test
   public void testFullConstructor()
   {
       Pet pet = new Pet("Blue",8,80.0,"dog","Lab");
       assertEquals( "Blue",pet.getName(),"The full constructor needs to initialize each instance variable with the parameters passed to the constructor method. Make sure you have created the getName() accessor method for the name variable.");
       assertEquals( 8,pet.getAge(),"The full constructor needs to initialize each instance variable with the parameters passed to the constructor method. Make sure you have created the getAge() accessor method for the age variable.");
       assertEquals( 80.0, pet.getWeight(), 0.0002, "The full constructor needs to initialize each instance variable with the parameters passed to the constructor method. Make sure you have created the getWeight() accessor method for the weight variable.");
       assertEquals( "dog",pet.getType(), "The full constructor needs to initialize each instance variable with the parameters passed to the constructor method. Make sure you have created the getType() accessor method for the type variable.");
       assertEquals( "Lab", pet.getBreed(),"The full constructor needs to initialize each instance variable with the parameters passed to the constructor method. Make sure you have created the getBreed() accessor method for the breed variable.");
   }
    @Test
    public void testBlankConstructor()
    {
        Pet pet = new Pet();
        assertEquals("", pet.getName(),"The blank constructor should initialize string variables as blank strings (\"\"), ints should be 1, and doubles should be 1.0.");
        assertEquals(1, pet.getAge(),"The blank constructor should initialize string variables as blank strings (\"\"), ints should be 1, and doubles should be 1.0.");
        assertEquals(1.0,pet.getWeight(),0.0002,"The blank constructor should initialize string variables as blank strings (\"\"), ints should be 1, and doubles should be 1.0.");
        assertEquals("",pet.getType(),"The blank constructor should initialize string variables as blank strings (\"\"), ints should be 1, and doubles should be 1.0.");
        assertEquals("", pet.getBreed(),"The blank constructor should initialize string variables as blank strings (\"\"), ints should be 1, and doubles should be 1.0.");

    }
    @Test
    public void testToString()
    {
        Pet pet = new Pet("Blue",8,80.0,"dog","Lab");
        assertEquals( "Blue, 8, 80.0, dog, Lab", pet.toString(),"Your toString() method needs to return all the data for the instance separated by a comma and space.");
    }

}
