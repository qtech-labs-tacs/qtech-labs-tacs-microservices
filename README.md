#### REST Hook and Web Hook


#### REST Hook

1. According to the website, “REST Hooks itself is not a specification, it is a collection of patterns that treat webhooks like subscriptions.” 

2. The REST Hook subscriptions are created, updated, and deleted using a REST API. 

3. The pattern is easy to understand and implement and advances the power of the traditional REST API. 

4. With REST Hooks, the REST API is able to communicate with other apps in real time, via webhooks, without a complicated setup. 



#####  The REST Hooks pattern has four basic requirements.

* Mechanism to store subscriptions
* Mechanism to modify subscriptions via API
* List of event types & implementation of events
* Mechanism to send hooks 



#### Web Hook


1. Webhooks allow web apps to communicate with each other, sending automated messages to notify others that something new has occurred. 
2. In a typical API, the client-side application calls the server-side application and consumes data. 
3. Webhooks are often referred to as “reverse APIs” because they flip this relationship. 
4. Instead of the server waiting to hear back from the client, the server-side application will call the client-side application through an end-point URL provided by the client application. 
5. That end-point URL (supplied by the client and consumed by the server-side application) is a webhook.



<br>

---

#### Flow Diagram


![alt text](https://www.olioapps.com/assets/blog/2019-11-01-rest-hooks/chart.png)



