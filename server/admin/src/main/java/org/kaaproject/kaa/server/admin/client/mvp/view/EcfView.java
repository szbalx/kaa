/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.admin.client.mvp.view;

import org.kaaproject.kaa.common.dto.event.EventSchemaVersionDto;
import org.kaaproject.kaa.server.admin.client.mvp.view.grid.AbstractGrid;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasValue;

public interface EcfView extends BaseDetailsView {

    public HasValue<String> getName();
    
    public HasValue<String> getNamespace();

    public HasValue<String> getClassName();

    public HasValue<String> getDescription();
    
    public HasValue<String> getCreatedUsername();

    public HasValue<String> getCreatedDateTime();

    public AbstractGrid<EventSchemaVersionDto, Integer> getEcfSchemasGrid();
    
    public HasClickHandlers getAddEcfSchemaButton();

}