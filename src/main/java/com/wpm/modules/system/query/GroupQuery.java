package com.wpm.modules.system.query;

import com.wpm.modules.system.entity.Group;
import com.wpm.utils.BaseQuery;

public class GroupQuery extends BaseQuery<Group> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 组名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
