/*
 * Copyright 2012 Database Lab., Korea Univ.
 *
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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tajo.master;

import tajo.QueryUnitAttemptId;
import tajo.engine.MasterWorkerProtos.QueryStatus;

public class MockupTask {
  private QueryUnitAttemptId unitId;
  private QueryStatus status;
  private int leftTime;

  public MockupTask(QueryUnitAttemptId unitId,
                    int runTime) {
    this.unitId = unitId;
    this.status = QueryStatus.QUERY_INPROGRESS;
    this.leftTime = runTime;
  }

  public QueryUnitAttemptId getId() {
    return this.unitId;
  }

  public QueryStatus getStatus() {
    return this.status;
  }

  public int getLeftTime() {
    return this.leftTime;
  }

  public void updateTime(int time) {
    this.leftTime -= time;
  }

  public void setStatus(QueryStatus status) {
    this.status = status;
  }
}
