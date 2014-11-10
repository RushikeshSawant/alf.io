/**
 * This file is part of alf.io.
 *
 * alf.io is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * alf.io is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with alf.io.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.bagarino.repository.user.join;

import io.bagarino.datamapper.Bind;
import io.bagarino.datamapper.Query;
import io.bagarino.datamapper.QueryRepository;
import io.bagarino.model.user.join.UserOrganization;

import java.util.List;

@QueryRepository
public interface UserOrganizationRepository {

    @Query("select * from j_user_organization where user_id = :userId")
    List<UserOrganization> findByUserId(@Bind("userId") int userId);

    @Query("select * from j_user_organization where org_id = :organizationId")
    List<UserOrganization> findByOrganizationId(@Bind("organizationId") int organizationId);

    @Query("insert into j_user_organization (user_id, org_id) values(:userId, :organizationId)")
    int create(@Bind("userId") int userId, @Bind("organizationId") int organizationId);

}
