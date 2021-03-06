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
package com.amazonaws.services.cloudfront.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DistributionIdList StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DistributionIdListStaxUnmarshaller implements Unmarshaller<DistributionIdList, StaxUnmarshallerContext> {

    public DistributionIdList unmarshall(StaxUnmarshallerContext context) throws Exception {
        DistributionIdList distributionIdList = new DistributionIdList();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return distributionIdList;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    distributionIdList.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextMarker", targetDepth)) {
                    distributionIdList.setNextMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxItems", targetDepth)) {
                    distributionIdList.setMaxItems(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    distributionIdList.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Quantity", targetDepth)) {
                    distributionIdList.setQuantity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Items", targetDepth)) {
                    distributionIdList.withItems(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Items/DistributionId", targetDepth)) {
                    distributionIdList.withItems(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return distributionIdList;
                }
            }
        }
    }

    private static DistributionIdListStaxUnmarshaller instance;

    public static DistributionIdListStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DistributionIdListStaxUnmarshaller();
        return instance;
    }
}
