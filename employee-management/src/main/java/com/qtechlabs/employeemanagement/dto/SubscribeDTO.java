package com.qtechlabs.employeemanagement.dto;

import java.io.Serializable;
import java.util.UUID;

import com.qtechlabs.employeemanagement.dto.enumeration.PublisherEvent;
import com.qtechlabs.employeemanagement.dto.enumeration.PublisherModel;

/*
 * 
    String OrgId (PK)
	String PubModel (CK1) 			// Publishing model Example: Lead, Quote (optional: if not available then NA)
	String PubModelId  (CK2)		// id of the Model (optional: if not available then NA)
	String PubEvent (CK2) 			// Event of the PubModel  OR independent event based on some method
	String SubWebhookURL (CK3) 		// When Pub Event is fired call this Webhook
	String SubInfo 					// Subscriber could provide info while registering
	UUID SubAuthenticationInfo		//This will be there in 3rd party info
	Int PubSLAInMinutes 			//How soon the Subscriber need to be notified, 0 means immediate
	
	
	1) Webhook call requires
		1) http method, authentication mechanism, url , request params/body, headers etc ?
		   are we agonistic on subscriber side webhook endpoint implementation ie we publish event in our
		   independent format which subscriber needs to handle ?
		
*
*/
public class SubscribeDTO implements Serializable {

	private static final long serialVersionUID = 3769382518106300525L;

	private String orgId;
	public PublisherModel publisherModel;
	public String publisherModelId;
	public PublisherEvent publisherEvent;
	public UUID subscriptionId;
	private String subscriptionWebhookURL;
	private SubscriberInfo subscriberInfo;
	private SubscriberAuthenticationInfo subscriberAuthenticationInfo;
	private Integer publisherSLAInMinutes;

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public PublisherModel getPublisherModel() {
		return publisherModel;
	}

	public void setPublisherModel(PublisherModel publisherModel) {
		this.publisherModel = publisherModel;
	}

	public String getPublisherModelId() {
		return publisherModelId;
	}

	public void setPublisherModelId(String publisherModelId) {
		this.publisherModelId = publisherModelId;
	}

	public PublisherEvent getPublisherEvent() {
		return publisherEvent;
	}

	public void setPublisherEvent(PublisherEvent publisherEvent) {
		this.publisherEvent = publisherEvent;
	}

	public String getSubscriberWebhookURL() {
		return subscriptionWebhookURL;
	}

	public void setSubscriberWebhookURL(String subscriberWebhookURL) {
		this.subscriptionWebhookURL = subscriberWebhookURL;
	}

	public SubscriberInfo getSubscriberInfo() {
		return subscriberInfo;
	}

	public void setSubscriberInfo(SubscriberInfo subscriberInfo) {
		this.subscriberInfo = subscriberInfo;
	}

	public SubscriberAuthenticationInfo getSubscriberAuthenticationInfo() {
		return subscriberAuthenticationInfo;
	}

	public void setSubscriberAuthenticationInfo(SubscriberAuthenticationInfo subscriberAuthenticationInfo) {
		this.subscriberAuthenticationInfo = subscriberAuthenticationInfo;
	}

	public Integer getPublisherSLAInMinutes() {
		return publisherSLAInMinutes;
	}

	public void setPublisherSLAInMinutes(Integer publisherSLAInMinutes) {
		this.publisherSLAInMinutes = publisherSLAInMinutes;
	}

}
