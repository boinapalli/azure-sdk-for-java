// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings model. */
@Fluent
public final class VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings {
    /*
     * The Domain name label.The concatenation of the domain name label and vm
     * index will be the domain name labels of the PublicIPAddress resources
     * that will be created
     */
    @JsonProperty(value = "domainNameLabel", required = true)
    private String domainNameLabel;

    /**
     * Get the domainNameLabel property: The Domain name label.The concatenation of the domain name label and vm index
     * will be the domain name labels of the PublicIPAddress resources that will be created.
     *
     * @return the domainNameLabel value.
     */
    public String domainNameLabel() {
        return this.domainNameLabel;
    }

    /**
     * Set the domainNameLabel property: The Domain name label.The concatenation of the domain name label and vm index
     * will be the domain name labels of the PublicIPAddress resources that will be created.
     *
     * @param domainNameLabel the domainNameLabel value to set.
     * @return the VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings object itself.
     */
    public VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings withDomainNameLabel(String domainNameLabel) {
        this.domainNameLabel = domainNameLabel;
        return this;
    }
}
