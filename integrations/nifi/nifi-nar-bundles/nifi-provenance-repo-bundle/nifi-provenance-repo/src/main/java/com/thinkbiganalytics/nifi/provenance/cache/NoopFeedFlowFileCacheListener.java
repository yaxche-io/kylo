package com.thinkbiganalytics.nifi.provenance.cache;

/*-
 * #%L
 * thinkbig-nifi-provenance-repo
 * %%
 * Copyright (C) 2017 ThinkBig Analytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.thinkbiganalytics.nifi.provenance.model.FeedFlowFile;

import java.util.List;
import java.util.Set;

/**
 * Created by sr186054 on 6/7/17.
 */
public class NoopFeedFlowFileCacheListener implements FeedFlowFileCacheListener {

    @Override
    public void onInvalidate(FeedFlowFile flowFile) {

    }

    @Override
    public void onPrimaryFeedFlowsComplete(Set<String> primaryFeedFlowId) {

    }
}
