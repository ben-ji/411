/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authenticationserver411_jennings;

import java.util.ArrayList;

/**
 *
 * @author ben_j
 */
public class UserList {
    
    private ArrayList<User> userList;
    
    UserList(){
        userList = new ArrayList<User>();
    }

    /**
     * @return the userList
     */
    public ArrayList<User> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public void add(User user){
        userList.add(user);
    }
    
    public User get(int index){
        return userList.get(index);
    }
