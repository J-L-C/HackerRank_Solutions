/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
    
    
Problem Description:

A linked list is said to contain a cycle if any node is visited more than once while traversing the list.

Complete the function provided in the editor below. It has one parameter: a pointer to a Node object named that points to the head of a linked list. Your function must return a boolean denoting whether or not there is a cycle in the list. If there is a cycle, return true; otherwise, return false.

Note: If the list is empty,  will be null.

Input Format

Our hidden code checker passes the appropriate argument to your function. You are not responsible for reading any input from stdin.

Constraints

Output Format

If the list contains a cycle, your function must return true. If the list does not contain a cycle, it must return false. The binary integer corresponding to the boolean value returned by your function is printed to stdout by our hidden code checker.
*/

boolean hasCycle(Node head) {
    
    Map<Node, Boolean> cycleMap = new HashMap<>();
    Node traveler = new Node();
    traveler = head;
    //If null, return false since it cannot contain a cycle
    if(head == null){
        return false;
    }
    else{
        
        while(traveler != null){
            //Used a hashMap using the Node object as the key. If key is found, return true because the traveler has already been
            //to that node.
            if(cycleMap.containsKey(traveler))
                return true;
            else if(!cycleMap.containsKey(traveler)){
            //If the key does not exist in the HashMap, go ahead and add it. This tells us that we have been here before.
                cycleMap.put(traveler,true);
                traveler = traveler.next;
            }
            
            
            
            
        }
        
        
    }
    //Not returned true in the previous statement, the linked list does not have a cycle and we can safely return false.
    return false;
}
