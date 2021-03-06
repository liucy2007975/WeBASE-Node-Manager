/**
 * Copyright 2014-2020  the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.webank.webase.node.mgr.group;

import com.webank.webase.node.mgr.group.entity.GroupGeneral;
import com.webank.webase.node.mgr.group.entity.StatisticalGroupTransInfo;
import com.webank.webase.node.mgr.group.entity.TbGroup;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * mapper for table tb_group.
 */
@Repository
public interface GroupMapper {

    /**
     * add group info
     */
    int save(TbGroup tbGroup);

    /**
     * remove by id.
     */
    int remove(@Param("groupId") Integer groupId);

    /**
     * update status.
     */
    int updateStatus(@Param("groupId") Integer groupId, @Param("groupStatus") Integer groupStatus);

    /**
     * query group count.
     */
    int getCount(@Param("groupId") Integer groupId, @Param("groupStatus") Integer groupStatus);

    /**
     * get all group.
     */
    List<TbGroup> getList(@Param("groupStatus") Integer groupStatus);

    /**
     * query the latest statistics trans on all groups.
     */
    List<StatisticalGroupTransInfo> queryLatestStatisticalTrans();

    /**
     * query general info.
     */
    GroupGeneral getGeneral(@Param("groupId") Integer groupId);

}
