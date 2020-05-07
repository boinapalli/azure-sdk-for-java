// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The TaskUpdateParameters model. */
@JsonFlatten
@Fluent
public class TaskUpdateParameters {
    /*
     * The ARM resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The current status of task.
     */
    @JsonProperty(value = "properties.status")
    private TaskStatus status;

    /*
     * The platform properties against which the run has to happen.
     */
    @JsonProperty(value = "properties.platform")
    private PlatformUpdateParameters platform;

    /*
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "properties.agentConfiguration")
    private AgentProperties agentConfiguration;

    /*
     * Run timeout in seconds.
     */
    @JsonProperty(value = "properties.timeout")
    private Integer timeout;

    /*
     * The properties for updating a task step.
     */
    @JsonProperty(value = "properties.step")
    private TaskStepUpdateParameters step;

    /*
     * The properties for updating trigger properties.
     */
    @JsonProperty(value = "properties.trigger")
    private TriggerUpdateParameters trigger;

    /*
     * The parameters that describes a set of credentials that will be used
     * when this run is invoked.
     */
    @JsonProperty(value = "properties.credentials")
    private Credentials credentials;

    /**
     * Get the tags property: The ARM resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The ARM resource tags.
     *
     * @param tags the tags value to set.
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the status property: The current status of task.
     *
     * @return the status value.
     */
    public TaskStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of task.
     *
     * @param status the status value to set.
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the platform property: The platform properties against which the run has to happen.
     *
     * @return the platform value.
     */
    public PlatformUpdateParameters platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform properties against which the run has to happen.
     *
     * @param platform the platform value to set.
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withPlatform(PlatformUpdateParameters platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the agentConfiguration property: The machine configuration of the run agent.
     *
     * @return the agentConfiguration value.
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the agentConfiguration property: The machine configuration of the run agent.
     *
     * @param agentConfiguration the agentConfiguration value to set.
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get the timeout property: Run timeout in seconds.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: Run timeout in seconds.
     *
     * @param timeout the timeout value to set.
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the step property: The properties for updating a task step.
     *
     * @return the step value.
     */
    public TaskStepUpdateParameters step() {
        return this.step;
    }

    /**
     * Set the step property: The properties for updating a task step.
     *
     * @param step the step value to set.
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withStep(TaskStepUpdateParameters step) {
        this.step = step;
        return this;
    }

    /**
     * Get the trigger property: The properties for updating trigger properties.
     *
     * @return the trigger value.
     */
    public TriggerUpdateParameters trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The properties for updating trigger properties.
     *
     * @param trigger the trigger value to set.
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withTrigger(TriggerUpdateParameters trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the credentials property: The parameters that describes a set of credentials that will be used when this run
     * is invoked.
     *
     * @return the credentials value.
     */
    public Credentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The parameters that describes a set of credentials that will be used when this run
     * is invoked.
     *
     * @param credentials the credentials value to set.
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }
}
