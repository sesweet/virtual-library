/*
 * Project: Virtual Library
 * Author: Sarah Sweet
 * Date: 04/25/2025
 * Description: Users of the virtual library
 */
package virtuallibrary;

public class User {

// Attributes for the User class 
  public int userId; 
  public String name;

// Constructor with parameters 
  public User(int id, String usersName) { 
    userId = id; 
    name = usersName;

}

// Gets the user's id number 
  public int getUserId() { 
    return userId;

}

// Sets the user's id 
  public void setUserId(int id) { 
    userId = id;

}

//Gets the user's name 
  public String getName() { 
    return name;

}

// Sets the user's name 
  public void setName(String userName) { 
    name = userName;

   } 
}

}
