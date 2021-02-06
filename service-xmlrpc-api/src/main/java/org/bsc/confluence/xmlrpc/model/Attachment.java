/**
 *
 * Copyright 2006 David Blevins
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.bsc.confluence.xmlrpc.model;

import java.util.Date;
import java.util.Map;
import org.bsc.confluence.ConfluenceService.Model;

/**
 * @version $Revision$ $Date$
 */
public class Attachment extends MapObject implements Model.Attachment {

    public Attachment() {
        super();
    }

    public Attachment(Map<String,Object> data) {
        super(data);
    }

    /**
     * numeric id of the attachment
     */
    public Model.ID getId() {
        return Model.ID.of(getString("id"));
    }

    public void setId(Model.ID id) {
        setString("id", id.toString());
    }

    /**
     * page ID of the attachment
     */
    public Model.ID getPageId() {
        return Model.ID.of(getString("pageId"));
    }

    public void setPageId(Model.ID pageId) {
        setString("pageId", pageId.toString());
    }

    /**
     * title of the attachment
     */
    public String getTitle() {
        return getString("title");
    }

    public void setTitle(String title) {
        setString("title", title);
    }

    /**
     * file name of the attachment {color:#cc3300}(Required){color}
     */
    public String getFileName() {
        return getString("fileName");
    }

    public void setFileName(String fileName) {
        setString("fileName", fileName);
    }

    /**
     * numeric file size of the attachment in bytes
     */
    public String getFileSize() {
        return getString("fileSize");
    }

    public void setFileSize(String fileSize) {
        setString("fileSize", fileSize);
    }

    /**
     * mime content type of the attachment {color:#cc0000}(Required){color}
     */
    public String getContentType() {
        return getString("contentType");
    }

    public void setContentType(String contentType) {
        setString("contentType", contentType);
    }

    /**
     * creation date of the attachment
     */
    public Date getCreated() {
        return getDate("created");
    }

    public void setCreated(Date created) {
        setDate("created", created);
    }

    /**
     * creator of the attachment
     */
    public String getCreator() {
        return getString("creator");
    }

    public void setCreator(String creator) {
        setString("creator", creator);
    }

    /**
     * url to download the attachment online
     */
    public String getUrl() {
        return getString("url");
    }

    public void setUrl(String url) {
        setString("url", url);
    }

    /**
     * comment for the attachment {color:#cc3300}(Required){color}
     */
    public String getComment() {
        return getString("comment");
    }

    public void setComment(String comment) {
        setString("comment", comment);
    }

    public Map<String,Object> toRawMap() {
        Map<String,Object> map = super.toRawMap();
        map.put("created", getCreated());
        return map;
    }

	@Override
	public String toString() {
		return new StringBuilder()
		.append("Attachment [Id=")
		.append(getId())
		.append(", PageId=")
		.append(getPageId())
		.append(", Title=")
		.append(getTitle())
		.append(", FileName=")
		.append(getFileName())
		.append(", FileSize=")
		.append(getFileSize())
		.append(", ContentType=")
		.append(getContentType())
		.append(", Created=")
		.append(getCreated())
		.append(", Creator=")
		.append(getCreator())
		.append(", Url=")
		.append(getUrl())
		.append(", Comment=")
		.append(getComment())
		.append("]")
		.toString();
	}
    
    
}
