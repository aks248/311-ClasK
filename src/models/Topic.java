package models;

import java.util.ArrayList;

public class Topic {
    
    private String topicName;
    private ArrayList<Message> messages;
    
    public Topic(String tName, ArrayList<Message> msgs){
        this.topicName = tName;
        this.messages = msgs;  
    }
    
    public void addMessagetoList(String type, String msgBody, String postedBy){
        getMessages().add(new Message(type, msgBody, postedBy));
    }
    

    /**
     * @return the topicName
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * @param topicName the topicName to set
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * @return the messages
     */
    public ArrayList<Message> getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
    
      
}
