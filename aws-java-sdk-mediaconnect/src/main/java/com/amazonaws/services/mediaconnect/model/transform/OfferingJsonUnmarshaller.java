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
package com.amazonaws.services.mediaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Offering JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfferingJsonUnmarshaller implements Unmarshaller<Offering, JsonUnmarshallerContext> {

    public Offering unmarshall(JsonUnmarshallerContext context) throws Exception {
        Offering offering = new Offering();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("currencyCode", targetDepth)) {
                    context.nextToken();
                    offering.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("duration", targetDepth)) {
                    context.nextToken();
                    offering.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("durationUnits", targetDepth)) {
                    context.nextToken();
                    offering.setDurationUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("offeringArn", targetDepth)) {
                    context.nextToken();
                    offering.setOfferingArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("offeringDescription", targetDepth)) {
                    context.nextToken();
                    offering.setOfferingDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pricePerUnit", targetDepth)) {
                    context.nextToken();
                    offering.setPricePerUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("priceUnits", targetDepth)) {
                    context.nextToken();
                    offering.setPriceUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceSpecification", targetDepth)) {
                    context.nextToken();
                    offering.setResourceSpecification(ResourceSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return offering;
    }

    private static OfferingJsonUnmarshaller instance;

    public static OfferingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OfferingJsonUnmarshaller();
        return instance;
    }
}
