
package com.coverity.ws.v6;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ConfigurationService", targetNamespace = "http://ws.coverity.com/v6")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConfigurationService {


    /**
     * 
     * @param message
     * @param usernames
     * @param subject
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "notify", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.Notify")
    @ResponseWrapper(localName = "notifyResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.NotifyResponse")
    public List<String> notify(
        @WebParam(name = "usernames", targetNamespace = "")
        List<String> usernames,
        @WebParam(name = "subject", targetNamespace = "")
        String subject,
        @WebParam(name = "message", targetNamespace = "")
        String message)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.coverity.ws.v6.AttributeDefinitionDataObj>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAttributes", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetAttributes")
    @ResponseWrapper(localName = "getAttributesResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetAttributesResponse")
    public List<AttributeDefinitionDataObj> getAttributes();

    /**
     * 
     * @return
     *     returns com.coverity.ws.v6.VersionDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVersion", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetVersion")
    @ResponseWrapper(localName = "getVersionResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetVersionResponse")
    public VersionDataObj getVersion()
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param groupSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createGroup", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateGroup")
    @ResponseWrapper(localName = "createGroupResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateGroupResponse")
    public void createGroup(
        @WebParam(name = "groupSpec", targetNamespace = "")
        GroupSpecDataObj groupSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param attributeDefinitionId
     * @return
     *     returns com.coverity.ws.v6.AttributeDefinitionDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAttribute", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetAttribute")
    @ResponseWrapper(localName = "getAttributeResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetAttributeResponse")
    public AttributeDefinitionDataObj getAttribute(
        @WebParam(name = "attributeDefinitionId", targetNamespace = "")
        AttributeDefinitionIdDataObj attributeDefinitionId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param filterSpec
     * @param pageSpec
     * @return
     *     returns com.coverity.ws.v6.GroupsPageDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGroups", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetGroups")
    @ResponseWrapper(localName = "getGroupsResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetGroupsResponse")
    public GroupsPageDataObj getGroups(
        @WebParam(name = "filterSpec", targetNamespace = "")
        GroupFilterSpecDataObj filterSpec,
        @WebParam(name = "pageSpec", targetNamespace = "")
        PageSpecDataObj pageSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param filterSpec
     * @param pageSpec
     * @return
     *     returns com.coverity.ws.v6.UsersPageDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetUsersResponse")
    public UsersPageDataObj getUsers(
        @WebParam(name = "filterSpec", targetNamespace = "")
        UserFilterSpecDataObj filterSpec,
        @WebParam(name = "pageSpec", targetNamespace = "")
        PageSpecDataObj pageSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param groupId
     * @return
     *     returns com.coverity.ws.v6.GroupDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGroup", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetGroup")
    @ResponseWrapper(localName = "getGroupResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetGroupResponse")
    public GroupDataObj getGroup(
        @WebParam(name = "groupId", targetNamespace = "")
        GroupIdDataObj groupId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param roleId
     * @return
     *     returns com.coverity.ws.v6.RoleDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRole", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetRole")
    @ResponseWrapper(localName = "getRoleResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetRoleResponse")
    public RoleDataObj getRole(
        @WebParam(name = "roleId", targetNamespace = "")
        RoleIdDataObj roleId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param componentId
     * @return
     *     returns com.coverity.ws.v6.ComponentDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComponent", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetComponent")
    @ResponseWrapper(localName = "getComponentResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetComponentResponse")
    public ComponentDataObj getComponent(
        @WebParam(name = "componentId", targetNamespace = "")
        ComponentIdDataObj componentId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param attributeDefinitionSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createAttribute", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateAttribute")
    @ResponseWrapper(localName = "createAttributeResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateAttributeResponse")
    public void createAttribute(
        @WebParam(name = "attributeDefinitionSpec", targetNamespace = "")
        AttributeDefinitionSpecDataObj attributeDefinitionSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.coverity.ws.v6.RoleDataObj>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllRoles", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetAllRoles")
    @ResponseWrapper(localName = "getAllRolesResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetAllRolesResponse")
    public List<RoleDataObj> getAllRoles();

    /**
     * 
     * @param attributeDefinitionId
     * @param attributeDefinitionSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateAttribute", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateAttribute")
    @ResponseWrapper(localName = "updateAttributeResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateAttributeResponse")
    public void updateAttribute(
        @WebParam(name = "attributeDefinitionId", targetNamespace = "")
        AttributeDefinitionIdDataObj attributeDefinitionId,
        @WebParam(name = "attributeDefinitionSpec", targetNamespace = "")
        AttributeDefinitionSpecDataObj attributeDefinitionSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param attributeDefinitionId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteAttribute", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteAttribute")
    @ResponseWrapper(localName = "deleteAttributeResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteAttributeResponse")
    public void deleteAttribute(
        @WebParam(name = "attributeDefinitionId", targetNamespace = "")
        AttributeDefinitionIdDataObj attributeDefinitionId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param componentMapSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createComponentMap", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateComponentMap")
    @ResponseWrapper(localName = "createComponentMapResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateComponentMapResponse")
    public void createComponentMap(
        @WebParam(name = "componentMapSpec", targetNamespace = "")
        ComponentMapSpecDataObj componentMapSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param componentMapSpec
     * @param componentMapId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateComponentMap", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateComponentMap")
    @ResponseWrapper(localName = "updateComponentMapResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateComponentMapResponse")
    public void updateComponentMap(
        @WebParam(name = "componentMapId", targetNamespace = "")
        ComponentMapIdDataObj componentMapId,
        @WebParam(name = "componentMapSpec", targetNamespace = "")
        ComponentMapSpecDataObj componentMapSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param componentMapId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteComponentMap", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteComponentMap")
    @ResponseWrapper(localName = "deleteComponentMapResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteComponentMapResponse")
    public void deleteComponentMap(
        @WebParam(name = "componentMapId", targetNamespace = "")
        ComponentMapIdDataObj componentMapId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param groupSpec
     * @param groupId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateGroup", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateGroup")
    @ResponseWrapper(localName = "updateGroupResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateGroupResponse")
    public void updateGroup(
        @WebParam(name = "groupId", targetNamespace = "")
        GroupIdDataObj groupId,
        @WebParam(name = "groupSpec", targetNamespace = "")
        GroupSpecDataObj groupSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param groupId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteGroup", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteGroup")
    @ResponseWrapper(localName = "deleteGroupResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteGroupResponse")
    public void deleteGroup(
        @WebParam(name = "groupId", targetNamespace = "")
        GroupIdDataObj groupId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param projectSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createProject", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateProject")
    @ResponseWrapper(localName = "createProjectResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateProjectResponse")
    public void createProject(
        @WebParam(name = "projectSpec", targetNamespace = "")
        ProjectSpecDataObj projectSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param projectSpec
     * @param projectId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateProject", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateProject")
    @ResponseWrapper(localName = "updateProjectResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateProjectResponse")
    public void updateProject(
        @WebParam(name = "projectId", targetNamespace = "")
        ProjectIdDataObj projectId,
        @WebParam(name = "projectSpec", targetNamespace = "")
        ProjectSpecDataObj projectSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param projectId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteProject", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteProject")
    @ResponseWrapper(localName = "deleteProjectResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteProjectResponse")
    public void deleteProject(
        @WebParam(name = "projectId", targetNamespace = "")
        ProjectIdDataObj projectId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param roleSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createRole", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateRole")
    @ResponseWrapper(localName = "createRoleResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateRoleResponse")
    public void createRole(
        @WebParam(name = "roleSpec", targetNamespace = "")
        RoleSpecDataObj roleSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param roleSpec
     * @param roleId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateRole", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateRole")
    @ResponseWrapper(localName = "updateRoleResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateRoleResponse")
    public void updateRole(
        @WebParam(name = "roleId", targetNamespace = "")
        RoleIdDataObj roleId,
        @WebParam(name = "roleSpec", targetNamespace = "")
        RoleSpecDataObj roleSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param roleId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteRole", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteRole")
    @ResponseWrapper(localName = "deleteRoleResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteRoleResponse")
    public void deleteRole(
        @WebParam(name = "roleId", targetNamespace = "")
        RoleIdDataObj roleId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param streamSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createStream", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateStream")
    @ResponseWrapper(localName = "createStreamResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateStreamResponse")
    public void createStream(
        @WebParam(name = "streamSpec", targetNamespace = "")
        StreamSpecDataObj streamSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param streamId
     * @param streamSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateStream", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateStream")
    @ResponseWrapper(localName = "updateStreamResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateStreamResponse")
    public void updateStream(
        @WebParam(name = "streamId", targetNamespace = "")
        StreamIdDataObj streamId,
        @WebParam(name = "streamSpec", targetNamespace = "")
        StreamSpecDataObj streamSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param streamId
     * @param onlyIfEmpty
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteStream", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteStream")
    @ResponseWrapper(localName = "deleteStreamResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteStreamResponse")
    public void deleteStream(
        @WebParam(name = "streamId", targetNamespace = "")
        StreamIdDataObj streamId,
        @WebParam(name = "onlyIfEmpty", targetNamespace = "")
        boolean onlyIfEmpty)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param triageStoreSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createTriageStore", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateTriageStore")
    @ResponseWrapper(localName = "createTriageStoreResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateTriageStoreResponse")
    public void createTriageStore(
        @WebParam(name = "triageStoreSpec", targetNamespace = "")
        TriageStoreSpecDataObj triageStoreSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param triageStoreSpec
     * @param triageStoreId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateTriageStore", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateTriageStore")
    @ResponseWrapper(localName = "updateTriageStoreResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateTriageStoreResponse")
    public void updateTriageStore(
        @WebParam(name = "triageStoreId", targetNamespace = "")
        TriageStoreIdDataObj triageStoreId,
        @WebParam(name = "triageStoreSpec", targetNamespace = "")
        TriageStoreSpecDataObj triageStoreSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param triageStoreId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteTriageStore", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteTriageStore")
    @ResponseWrapper(localName = "deleteTriageStoreResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteTriageStoreResponse")
    public void deleteTriageStore(
        @WebParam(name = "triageStoreId", targetNamespace = "")
        TriageStoreIdDataObj triageStoreId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param userSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createUser", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateUserResponse")
    public void createUser(
        @WebParam(name = "userSpec", targetNamespace = "")
        UserSpecDataObj userSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param username
     * @param userSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateUserResponse")
    public void updateUser(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "userSpec", targetNamespace = "")
        UserSpecDataObj userSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param username
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteUserResponse")
    public void deleteUser(
        @WebParam(name = "username", targetNamespace = "")
        String username)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param filterSpec
     * @return
     *     returns java.util.List<com.coverity.ws.v6.StreamDataObj>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStreams", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetStreams")
    @ResponseWrapper(localName = "getStreamsResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetStreamsResponse")
    public List<StreamDataObj> getStreams(
        @WebParam(name = "filterSpec", targetNamespace = "")
        StreamFilterSpecDataObj filterSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param username
     * @return
     *     returns com.coverity.ws.v6.UserDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetUserResponse")
    public UserDataObj getUser(
        @WebParam(name = "username", targetNamespace = "")
        String username)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.coverity.ws.v6.PermissionDataObj>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllPermissions", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetAllPermissions")
    @ResponseWrapper(localName = "getAllPermissionsResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetAllPermissionsResponse")
    public List<PermissionDataObj> getAllPermissions();

    /**
     * 
     * @param streamId
     * @param filterSpec
     * @return
     *     returns java.util.List<com.coverity.ws.v6.SnapshotIdDataObj>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSnapshotsForStream", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetSnapshotsForStream")
    @ResponseWrapper(localName = "getSnapshotsForStreamResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetSnapshotsForStreamResponse")
    public List<SnapshotIdDataObj> getSnapshotsForStream(
        @WebParam(name = "streamId", targetNamespace = "")
        StreamIdDataObj streamId,
        @WebParam(name = "filterSpec", targetNamespace = "")
        SnapshotFilterSpecDataObj filterSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param snapshotId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteSnapshot", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteSnapshot")
    @ResponseWrapper(localName = "deleteSnapshotResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.DeleteSnapshotResponse")
    public void deleteSnapshot(
        @WebParam(name = "snapshotId", targetNamespace = "")
        List<SnapshotIdDataObj> snapshotId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessageOfTheDay", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetMessageOfTheDay")
    @ResponseWrapper(localName = "getMessageOfTheDayResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetMessageOfTheDayResponse")
    public String getMessageOfTheDay();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setMessageOfTheDay", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.SetMessageOfTheDay")
    @ResponseWrapper(localName = "setMessageOfTheDayResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.SetMessageOfTheDayResponse")
    public void setMessageOfTheDay(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setAcceptingNewCommits", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.SetAcceptingNewCommits")
    @ResponseWrapper(localName = "setAcceptingNewCommitsResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.SetAcceptingNewCommitsResponse")
    public void setAcceptingNewCommits(
        @WebParam(name = "arg0", targetNamespace = "")
        boolean arg0);

    /**
     * 
     * @param filterSpec
     * @return
     *     returns java.util.List<com.coverity.ws.v6.CheckerPropertyDataObj>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCheckerProperties", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetCheckerProperties")
    @ResponseWrapper(localName = "getCheckerPropertiesResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetCheckerPropertiesResponse")
    public List<CheckerPropertyDataObj> getCheckerProperties(
        @WebParam(name = "filterSpec", targetNamespace = "")
        CheckerPropertyFilterSpecDataObj filterSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param projectId
     * @param sourceStreamId
     * @return
     *     returns com.coverity.ws.v6.StreamDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "copyStream", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CopyStream")
    @ResponseWrapper(localName = "copyStreamResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CopyStreamResponse")
    public StreamDataObj copyStream(
        @WebParam(name = "projectId", targetNamespace = "")
        ProjectIdDataObj projectId,
        @WebParam(name = "sourceStreamId", targetNamespace = "")
        StreamIdDataObj sourceStreamId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param streamSpec
     * @param projectId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createStreamInProject", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateStreamInProject")
    @ResponseWrapper(localName = "createStreamInProjectResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.CreateStreamInProjectResponse")
    public void createStreamInProject(
        @WebParam(name = "projectId", targetNamespace = "")
        ProjectIdDataObj projectId,
        @WebParam(name = "streamSpec", targetNamespace = "")
        StreamSpecDataObj streamSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param filterSpec
     * @return
     *     returns java.util.List<com.coverity.ws.v6.ProjectDataObj>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProjects", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetProjects")
    @ResponseWrapper(localName = "getProjectsResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetProjectsResponse")
    public List<ProjectDataObj> getProjects(
        @WebParam(name = "filterSpec", targetNamespace = "")
        ProjectFilterSpecDataObj filterSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param filterSpec
     * @return
     *     returns java.util.List<com.coverity.ws.v6.ComponentMapDataObj>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComponentMaps", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetComponentMaps")
    @ResponseWrapper(localName = "getComponentMapsResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetComponentMapsResponse")
    public List<ComponentMapDataObj> getComponentMaps(
        @WebParam(name = "filterSpec", targetNamespace = "")
        ComponentMapFilterSpecDataObj filterSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDefectStatuses", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetDefectStatuses")
    @ResponseWrapper(localName = "getDefectStatusesResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetDefectStatusesResponse")
    public List<String> getDefectStatuses()
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param snapshotIds
     * @return
     *     returns java.util.List<com.coverity.ws.v6.SnapshotInfoDataObj>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSnapshotInformation", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetSnapshotInformation")
    @ResponseWrapper(localName = "getSnapshotInformationResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetSnapshotInformationResponse")
    public List<SnapshotInfoDataObj> getSnapshotInformation(
        @WebParam(name = "snapshotIds", targetNamespace = "")
        List<SnapshotIdDataObj> snapshotIds)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getServerTime", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetServerTime")
    @ResponseWrapper(localName = "getServerTimeResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetServerTimeResponse")
    public XMLGregorianCalendar getServerTime()
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns com.coverity.ws.v6.ConfigurationDataObj
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSystemConfig", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetSystemConfig")
    @ResponseWrapper(localName = "getSystemConfigResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetSystemConfigResponse")
    public ConfigurationDataObj getSystemConfig();

    /**
     * 
     * @param filterSpec
     * @return
     *     returns java.util.List<com.coverity.ws.v6.TriageStoreDataObj>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTriageStores", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetTriageStores")
    @ResponseWrapper(localName = "getTriageStoresResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetTriageStoresResponse")
    public List<TriageStoreDataObj> getTriageStores(
        @WebParam(name = "filterSpec", targetNamespace = "")
        TriageStoreFilterSpecDataObj filterSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns com.coverity.ws.v6.CommitStateDataObj
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCommitState", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetCommitState")
    @ResponseWrapper(localName = "getCommitStateResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetCommitStateResponse")
    public CommitStateDataObj getCommitState();

    /**
     * 
     * @return
     *     returns java.util.List<com.coverity.ws.v6.ServerDomainIdDataObj>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLdapServerDomains", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetLdapServerDomains")
    @ResponseWrapper(localName = "getLdapServerDomainsResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetLdapServerDomainsResponse")
    public List<ServerDomainIdDataObj> getLdapServerDomains();

    /**
     * 
     * @return
     *     returns com.coverity.ws.v6.LicenseStateDataObj
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLicenseState", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetLicenseState")
    @ResponseWrapper(localName = "getLicenseStateResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetLicenseStateResponse")
    public LicenseStateDataObj getLicenseState();

    /**
     * 
     * @param snapshotId
     * @param snapshotData
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateSnapshotInfo", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateSnapshotInfo")
    @ResponseWrapper(localName = "updateSnapshotInfoResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.UpdateSnapshotInfoResponse")
    public void updateSnapshotInfo(
        @WebParam(name = "snapshotId", targetNamespace = "")
        SnapshotIdDataObj snapshotId,
        @WebParam(name = "snapshotData", targetNamespace = "")
        SnapshotInfoDataObj snapshotData)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.coverity.ws.v6.FeatureUpdateTimeDataObj>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLastUpdateTimes", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetLastUpdateTimes")
    @ResponseWrapper(localName = "getLastUpdateTimesResponse", targetNamespace = "http://ws.coverity.com/v6", className = "com.coverity.ws.v6.GetLastUpdateTimesResponse")
    public List<FeatureUpdateTimeDataObj> getLastUpdateTimes();

}
