/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyun.oss.internal.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

@XmlRootElement(name = "Error")
public class OSSErrorResult {
    @XmlElement(name = "Code")
    public String Code;

    @XmlElement(name = "Message")
    public String Message;

    @XmlElement(name = "RequestId")
    public String RequestId;

    @XmlElement(name = "HostId")
    public String HostId;

    @XmlElement(name = "ResourceType")
    public String ResourceType;

    @XmlElement(name = "Method")
    public String Method;

    @XmlElement(name = "Header")
    public String Header;

    @XmlElement(name = "EC")
    public String EC;

    public Map<String, String> ErrorFields;
}