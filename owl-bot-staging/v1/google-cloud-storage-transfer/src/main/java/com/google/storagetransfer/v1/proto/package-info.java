/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Storage Transfer API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= StorageTransferServiceClient =======================
 *
 * <p>Service Description: Storage Transfer Service and its protos. Transfers data between between
 * Google Cloud Storage buckets or from a data source external to Google to a Cloud Storage bucket.
 *
 * <p>Sample for StorageTransferServiceClient:
 *
 * <pre>{@code
 * try (StorageTransferServiceClient storageTransferServiceClient =
 *     StorageTransferServiceClient.create()) {
 *   TransferProto.GetGoogleServiceAccountRequest request =
 *       TransferProto.GetGoogleServiceAccountRequest.newBuilder()
 *           .setProjectId("projectId-894832108")
 *           .build();
 *   TransferTypes.GoogleServiceAccount response =
 *       storageTransferServiceClient.getGoogleServiceAccount(request);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.storagetransfer.v1.proto;

import javax.annotation.Generated;
