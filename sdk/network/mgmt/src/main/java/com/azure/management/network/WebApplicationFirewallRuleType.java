// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WebApplicationFirewallRuleType. */
public final class WebApplicationFirewallRuleType extends ExpandableStringEnum<WebApplicationFirewallRuleType> {
    /** Static value MatchRule for WebApplicationFirewallRuleType. */
    public static final WebApplicationFirewallRuleType MATCH_RULE = fromString("MatchRule");

    /** Static value Invalid for WebApplicationFirewallRuleType. */
    public static final WebApplicationFirewallRuleType INVALID = fromString("Invalid");

    /**
     * Creates or finds a WebApplicationFirewallRuleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WebApplicationFirewallRuleType.
     */
    @JsonCreator
    public static WebApplicationFirewallRuleType fromString(String name) {
        return fromString(name, WebApplicationFirewallRuleType.class);
    }

    /** @return known WebApplicationFirewallRuleType values. */
    public static Collection<WebApplicationFirewallRuleType> values() {
        return values(WebApplicationFirewallRuleType.class);
    }
}
