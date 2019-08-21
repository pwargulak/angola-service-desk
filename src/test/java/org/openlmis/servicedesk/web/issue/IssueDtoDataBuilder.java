/*
 * This program is part of the OpenLMIS logistics management information system platform software.
 * Copyright © 2017 VillageReach
 *
 * This program is free software: you can redistribute it and/or modify it under the terms
 * of the GNU Affero General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details. You should have received a copy of
 * the GNU Affero General Public License along with this program. If not, see
 * http://www.gnu.org/licenses.  For additional information contact info@OpenLMIS.org.
 */

package org.openlmis.servicedesk.web.issue;

public class IssueDtoDataBuilder {

  private static int instanceNumber = 0;

  private IssueType type;
  private String summary;
  private String description;
  private PriorityType priority;
  private ImpactType impact;
  private String email;
  private String displayName;
  private String username;
  private String url;

  /**
   * Constructor for {@link IssueDtoDataBuilder}. Sets default values for new instance of {@link
   * IssueDto} class.
   */
  public IssueDtoDataBuilder() {
    instanceNumber++;

    type = IssueType.SUPPORT;
    summary = "summary-" + instanceNumber;
    priority = PriorityType.LOW;
    impact = ImpactType.LOCAL;
    email = String.format("user%s@siglofa.org", instanceNumber);
    displayName = "User " + instanceNumber;
    username = "Username " + instanceNumber;
    url = "Url " + instanceNumber;
    description = "description" + instanceNumber;
  }

  public IssueDto build() {
    return new IssueDto(type, summary, description, priority, impact, email, displayName, username,
        url);
  }
}
