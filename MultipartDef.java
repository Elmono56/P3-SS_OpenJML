/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tomcat.util.descriptor.web;

import java.io.Serializable;


/**
 * Representation of a the multipart configuration for a servlet.
 */
public class MultipartDef implements Serializable {

    //@ private invariant serialVersionUID == 1L;
    private static final long serialVersionUID = 1L;

    // ------------------------------------------------------------- Properties

    //@ spec_public 
    private String location;

    //@ ensures \result == location && \result != null;
    public String getLocation() {
        return location;
    }

    //@ requires location != null;
    //@ ensures this.location == location;
    public void setLocation(String location) {
        this.location = location;
    }


    //@ spec_public 
    private String maxFileSize;

    //@ ensures \result == maxFileSize && \result != null;
    public String getMaxFileSize() {
        return maxFileSize;
    }

    //@ requires maxFileSize != null;
    //@ ensures this.maxFileSize == maxFileSize;
    public void setMaxFileSize(String maxFileSize) {
        this.maxFileSize = maxFileSize;
    }


    //@ spec_public 
    private String maxRequestSize;

   //@ ensures \result == maxRequestSize && \result != null;
    public String getMaxRequestSize() {
        return maxRequestSize;
    }

    //@ requires maxRequestSize != null;
    //@ ensures this.maxRequestSize == maxRequestSize;
    public void setMaxRequestSize(String maxRequestSize) {
        this.maxRequestSize = maxRequestSize;
    }


    //@ spec_public
    private String fileSizeThreshold;

    //@ ensures \result == fileSizeThreshold && \result != null;
    public String getFileSizeThreshold() {
        return fileSizeThreshold;
    }

    //@ requires fileSizeThreshold != null;
    //@ ensures this.fileSizeThreshold == fileSizeThreshold;
    public void setFileSizeThreshold(String fileSizeThreshold) {
        this.fileSizeThreshold = fileSizeThreshold;
    }


    // ---------------------------------------------------------- Object methods

    @Override
    //@ private invariant prime == 31;
    //@ ensures prime = 1;
    public int hashCode() {
        final int prime = 31;
        result = prime
                * result
                + ((fileSizeThreshold == null) ? 0 : fileSizeThreshold
                        .hashCode());
        result = prime * result
                + ((location == null) ? 0 : location.hashCode());
        result = prime * result
                + ((maxFileSize == null) ? 0 : maxFileSize.hashCode());
        result = prime * result
                + ((maxRequestSize == null) ? 0 : maxRequestSize.hashCode());
        return result;
    }

    @Override
    //@ requires obj != null;
    //@ requires this.location != null;
    //@ requires this.maxFileSize != null;
    //@ requires this.maxRequestSize != null;
    //@ requires this.fileSizeThreshold != null;
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MultipartDef)) {
            return false;
        }
        MultipartDef other = (MultipartDef) obj;
        if (fileSizeThreshold == null) {
            if (other.fileSizeThreshold != null) {
                return false;
            }
        } else if (!fileSizeThreshold.equals(other.fileSizeThreshold)) {
            return false;
        }
        if (location == null) {
            if (other.location != null) {
                return false;
            }
        } else if (!location.equals(other.location)) {
            return false;
        }
        if (maxFileSize == null) {
            if (other.maxFileSize != null) {
                return false;
            }
        } else if (!maxFileSize.equals(other.maxFileSize)) {
            return false;
        }
        if (maxRequestSize == null) {
            if (other.maxRequestSize != null) {
                return false;
            }
        } else if (!maxRequestSize.equals(other.maxRequestSize)) {
            return false;
        }
        return true;
    }

}
