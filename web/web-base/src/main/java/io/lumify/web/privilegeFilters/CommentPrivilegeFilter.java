package io.lumify.web.privilegeFilters;

import com.google.inject.Inject;
import io.lumify.core.config.Configuration;
import io.lumify.core.model.user.UserRepository;
import io.lumify.core.model.workspace.WorkspaceRepository;
import io.lumify.web.clientapi.model.Privilege;

import java.util.EnumSet;

public class CommentPrivilegeFilter extends PrivilegeFilter {
    @Inject
    protected CommentPrivilegeFilter(UserRepository userRepository, WorkspaceRepository workspaceRepository, Configuration configuration) {
        super(EnumSet.of(Privilege.COMMENT), userRepository, workspaceRepository, configuration);
    }
}
