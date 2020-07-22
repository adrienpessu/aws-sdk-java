/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountCustomization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountCustomizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the AWS account that you want to update QuickSight customizations for.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The namespace associated with the customization that you're updating.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The customizations you want to update in QuickSight.
     * </p>
     */
    private AccountCustomization accountCustomization;

    /**
     * <p>
     * The ID for the AWS account that you want to update QuickSight customizations for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to update QuickSight customizations for.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to update QuickSight customizations for.
     * </p>
     * 
     * @return The ID for the AWS account that you want to update QuickSight customizations for.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to update QuickSight customizations for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to update QuickSight customizations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountCustomizationRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The namespace associated with the customization that you're updating.
     * </p>
     * 
     * @param namespace
     *        The namespace associated with the customization that you're updating.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace associated with the customization that you're updating.
     * </p>
     * 
     * @return The namespace associated with the customization that you're updating.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace associated with the customization that you're updating.
     * </p>
     * 
     * @param namespace
     *        The namespace associated with the customization that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountCustomizationRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The customizations you want to update in QuickSight.
     * </p>
     * 
     * @param accountCustomization
     *        The customizations you want to update in QuickSight.
     */

    public void setAccountCustomization(AccountCustomization accountCustomization) {
        this.accountCustomization = accountCustomization;
    }

    /**
     * <p>
     * The customizations you want to update in QuickSight.
     * </p>
     * 
     * @return The customizations you want to update in QuickSight.
     */

    public AccountCustomization getAccountCustomization() {
        return this.accountCustomization;
    }

    /**
     * <p>
     * The customizations you want to update in QuickSight.
     * </p>
     * 
     * @param accountCustomization
     *        The customizations you want to update in QuickSight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountCustomizationRequest withAccountCustomization(AccountCustomization accountCustomization) {
        setAccountCustomization(accountCustomization);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getAccountCustomization() != null)
            sb.append("AccountCustomization: ").append(getAccountCustomization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountCustomizationRequest == false)
            return false;
        UpdateAccountCustomizationRequest other = (UpdateAccountCustomizationRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getAccountCustomization() == null ^ this.getAccountCustomization() == null)
            return false;
        if (other.getAccountCustomization() != null && other.getAccountCustomization().equals(this.getAccountCustomization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getAccountCustomization() == null) ? 0 : getAccountCustomization().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountCustomizationRequest clone() {
        return (UpdateAccountCustomizationRequest) super.clone();
    }

}
