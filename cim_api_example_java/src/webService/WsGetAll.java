// (c) 2009-2016 Coverity, Inc. All rights reserved worldwide.
//
package webService;


import javax.xml.ws.WebServiceRef;
import java.lang.System;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.ws.handler.Handler;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.xml.datatype.XMLGregorianCalendar;
import webService.*;
import com.coverity.ws.v8.*;
import java.io.ByteArrayOutputStream;
import java.util.zip.Inflater;
 
/** 
 * Example application that uses Web Services to work with the
 * Coverity Connect server.   
 *  *
 * @param serverAddr
 *          The address of the server, including the port number
 *          in <code>address:port</code> format.
 * @param user
 *          The user name for credentials.
 * @param password
 *          The password for the user.
 *
 *
 */
public class WsGetAll {
    /**
     * <code>main</code> entry point.  
     */
	public static void main (String[] args)  {
        try {
			if(args.length != 3){
				System.err.println(
                    "Usage:\n <this-command> <server-address>:<port> <user> <password>");
				System.exit(1);
			}
			String serverAddr = args[0];
			String user = args[1];
			String password = args[2];
			//****************************************************************************
            ConfigurationService configurationService = getCS(serverAddr, user, password);
            DefectService defectService = getDS(serverAddr, user, password);
			//****************************************************************************
			
            System.out.println("Get WebServiceCalls...");
			
			//getAllLdapConfigurations
			List<LdapConfigurationDataObj> ldapConfigurations=configurationService.getAllLdapConfigurations();
			List<PermissionDataObj> permissions=configurationService.getAllPermissions();
			List<RoleDataObj> roles=configurationService.getAllRoles();
			System.out.println("------------getAllRoles");

			//getAttribute
			AttributeDefinitionIdDataObj attributeDefinition = new AttributeDefinitionIdDataObj();
			attributeDefinition.setName("Action");
			AttributeDefinitionDataObj attribute= configurationService.getAttribute(attributeDefinition);
			System.out.println("------------getAttribute");
			
			//getAttributes
			List<AttributeDefinitionDataObj> attributes=configurationService.getAttributes();
			BackupConfigurationDataObj backupConfiguration=configurationService.getBackupConfiguration();
			
			//getCheckerProperties
			CheckerPropertyFilterSpecDataObj filterSpec=new CheckerPropertyFilterSpecDataObj();
			List<CheckerPropertyDataObj> checkerProperties=configurationService.getCheckerProperties(filterSpec);
			System.out.println("------------getCheckerProperties");
			
			//getCheckerSubcategoriesForProject
			ProjectIdDataObj projectId2 = new ProjectIdDataObj();
			projectId2.setName("gzip");
			List<CheckerSubcategoryIdDataObj> checkerSubCategories=defectService.getCheckerSubcategoriesForProject(projectId2);
			System.out.println("------------getCheckerSubcategoriesForProject");
			
			//getCheckerSubcategoriesForStreams
			StreamIdDataObj streamId3 = new StreamIdDataObj();
			streamId3.setName("gzip-trunk");
			List<StreamIdDataObj> streamIds1= new ArrayList<StreamIdDataObj>();
			streamIds1.add(streamId3);			
			List<CheckerSubcategoryIdDataObj> checkerSubCategories1=defectService.getCheckerSubcategoriesForStreams(streamIds1);
			System.out.println("------------getCheckerSubcategoriesForStreams");
			
			//getCommitState
            CommitStateDataObj commitState = configurationService.getCommitState();
			System.out.println("------------getCommitState");
            System.out.println("CurrentCommits:" + commitState.getCurrentCommitCount());
            System.out.println("AcceptingNewCommits:" + commitState.isIsAcceptingNewCommits());
			
			//getComponent 
			ComponentIdDataObj componentSpec = new ComponentIdDataObj();
			componentSpec.setName("Default.Other");
			ComponentDataObj component=configurationService.getComponent(componentSpec);
			System.out.println("------------getComponent");
			
			//getComponentMaps
			ComponentMapFilterSpecDataObj componentMapSpec = new ComponentMapFilterSpecDataObj();
			componentMapSpec.setNamePattern("*");
			List<ComponentMapDataObj> componentMaps=configurationService.getComponentMaps(componentMapSpec);
			System.out.println("------------getComponentMaps");
			
			//getComponentMetricsForProject
			List<String> defectStatuses=configurationService.getDefectStatuses();
			System.out.println("------------getDefectStatuses");
			
			//getDeleteSnapshotJobInfo
			SnapshotIdDataObj  snapshotId1 = new SnapshotIdDataObj();
			snapshotId1.setId((long)10003);
			List<SnapshotIdDataObj> snapshotIds= new ArrayList<SnapshotIdDataObj>();
			snapshotIds.add(snapshotId1);			
			List<DeleteSnapshotJobInfoDataObj> deleteSnapshotJobInfo = configurationService.getDeleteSnapshotJobInfo(snapshotIds);
			System.out.println("------------getDeleteSnapshotJobInfo");
			
			//getDeveloperStreamsProjects
			ProjectFilterSpecDataObj projectFilter1 = new ProjectFilterSpecDataObj();
			projectFilter1.setNamePattern("*");
			List<ProjectDataObj> developerStreamsProjects = configurationService.getDeveloperStreamsProjects(projectFilter1);
			System.out.println("------------getDeveloperStreamsProjects");
			
			//getFileContents
			//You can get the contentsMD5 and filePathname for an instance of a CID 
			//by using getStreamDefects() with the includeDefectInstances filter set to true.
			//content is compressed (base64 decoded) byte array
			StreamIdDataObj streamId4 = new StreamIdDataObj();
			streamId4.setName("gzip-trunk");
			FileIdDataObj fileId= new FileIdDataObj();
			fileId.setContentsMD5("575c0797e385f4236ed36539186a72a4"); 
			fileId.setFilePathname("/idirs-7.7.0-pass1again/gzip-trunk/inflate.c");
			FileContentsDataObj fileContents = defectService.getFileContents(streamId4,fileId);
			System.out.println("------------getFileContents");
//			byte[] contents = fileContents.getContents();
			String contents= new String (decompressByteArray(fileContents.getContents()));
			//System.out.println(contents);	

			//getGroup
			GroupIdDataObj groupSpec = new GroupIdDataObj();
			groupSpec.setName("Users");
			GroupDataObj group = configurationService.getGroup(groupSpec);
			System.out.println("------------getGroup");
			
			//getGroups
			GroupFilterSpecDataObj groupFilter  = new GroupFilterSpecDataObj();
			PageSpecDataObj pageSpec = new PageSpecDataObj();
			pageSpec.setPageSize(100);
			pageSpec.setStartIndex(0);
			GroupsPageDataObj groupsPage = configurationService.getGroups(groupFilter,pageSpec);
			System.out.println("------------getGroups");
			
			//getLastUpdateTimes
			List<FeatureUpdateTimeDataObj> lastUpdateTimes = configurationService.getLastUpdateTimes();
			System.out.println("------------getLastUpdateTimes");
			
			//getLdapServerDomains
			List<ServerDomainIdDataObj> ldapServerDomains = configurationService.getLdapServerDomains();
			System.out.println("------------getLdapServerDomains");
						
			//getLicenseConfiguration
			LicenseDataObj  licenseConfiguration=configurationService.getLicenseConfiguration();			
			LicenseStateDataObj licenseState=configurationService.getLicenseState();
			LoggingConfigurationDataObj loggingConfiguration=configurationService.getLoggingConfiguration();
			System.out.println("------------getLoggingConfiguration");
			
			//getMergedDefectDetectionHistory
			MergedDefectIdDataObj mdid1 = new MergedDefectIdDataObj();
			mdid1.setCid((long) 10641);
			StreamIdDataObj streamId1 = new StreamIdDataObj();
			streamId1.setName("gzip-trunk");
			List<StreamIdDataObj> streamIds= new ArrayList<StreamIdDataObj>();
			streamIds.add(streamId1);			
			List<DefectDetectionHistoryDataObj> mergedDefectDetectionHistory = defectService.getMergedDefectDetectionHistory(mdid1,streamIds);
			System.out.println("------------getMergedDefectDetectionHistory");
			
			//getMergedDefectsForProjectScope
			ProjectIdDataObj projectId0 = new ProjectIdDataObj();
			projectId0.setName("gzip");
			ProjectScopeDefectFilterSpecDataObj projectScopeFilter = new ProjectScopeDefectFilterSpecDataObj();
			PageSpecDataObj pageSpec0 = new PageSpecDataObj();
			pageSpec0.setPageSize(100);
			pageSpec0.setStartIndex(0);
			MergedDefectsPageDataObj mergedDefects = defectService.getMergedDefectsForProjectScope(projectId0,projectScopeFilter,pageSpec0);
			System.out.println("------------getMergedDefectsForProjectScope");
			
			//getMergedDefectsForSnapshotScope
			ProjectIdDataObj projectId1 = new ProjectIdDataObj();
			projectId1.setName("gzip");
			SnapshotScopeDefectFilterSpecDataObj snapshotScopeFilter = new SnapshotScopeDefectFilterSpecDataObj();
			PageSpecDataObj pageSpec1 = new PageSpecDataObj();
			pageSpec1.setPageSize(100);
			pageSpec1.setStartIndex(0);
			SnapshotScopeSpecDataObj snapshotScope= new SnapshotScopeSpecDataObj();
			snapshotScope.setShowSelector("last()");
			MergedDefectsPageDataObj mergedDefects1 = defectService.getMergedDefectsForSnapshotScope(projectId1,snapshotScopeFilter,pageSpec1,snapshotScope);
			System.out.println("------------getMergedDefectsForSnapshotScope");
			
			//getMergedDefectsForStreams
			StreamIdDataObj streamId2 = new StreamIdDataObj();
			streamId2.setName("gzip-trunk");
			List<StreamIdDataObj> streadmIds= new ArrayList<StreamIdDataObj>();
			streadmIds.add(streamId2);			
			MergedDefectFilterSpecDataObj mergedDefectFilter = new MergedDefectFilterSpecDataObj();
			PageSpecDataObj pageSpec2 = new PageSpecDataObj();
			pageSpec2.setPageSize(100);
			pageSpec2.setStartIndex(0);
			SnapshotScopeSpecDataObj snapshotScope0= new SnapshotScopeSpecDataObj();
			snapshotScope0.setShowSelector("last()");
			MergedDefectsPageDataObj mergedDefects2 = defectService.getMergedDefectsForStreams(streamIds,mergedDefectFilter,pageSpec1,snapshotScope);
			System.out.println("------------getMergedDefectsForStreams");
			
			//getMessageOfTheDay
			String messageOfTheDay = configurationService.getMessageOfTheDay();
			System.out.println("------------getMessageOfTheDay");
			
			//getProjects
			ProjectFilterSpecDataObj projectFilter = new ProjectFilterSpecDataObj();
			projectFilter.setNamePattern("*");
			List<ProjectDataObj> projects = configurationService.getProjects(projectFilter);
			System.out.println("------------getProjects");
			
			//getRole
			RoleIdDataObj roleId = new RoleIdDataObj();
			roleId.setName("Developer");
			RoleDataObj role = configurationService.getRole(roleId);
			System.out.println("------------getRole");
			
			//getServerTime
			XMLGregorianCalendar  serverTime=configurationService.getServerTime();
			SignInSettingsDataObj  signInConfiguration=configurationService.getSignInConfiguration();
			SkeletonizationConfigurationDataObj  skeletonizationConfiguration=configurationService.getSkeletonizationConfiguration();
			System.out.println("------------getSkeletonizationConfiguration");

			//getSnapshotInformation
			SnapshotIdDataObj  snapshotId = new SnapshotIdDataObj();
			snapshotId.setId(10001);
			List<SnapshotIdDataObj> snapshotIdList= new ArrayList<SnapshotIdDataObj>();
			snapshotIdList.add(snapshotId);
			List<SnapshotInfoDataObj> snapshotInfos=configurationService.getSnapshotInformation(snapshotIdList);
			System.out.println("------------getSnapshotInformation");
			
			//getSnapshotPurgeDetails<-deprecated , use getSkeletonizationConfiguration() i

			//getSnapshotsForStream
			StreamIdDataObj streamId= new StreamIdDataObj();
			streamId.setName("gzip-trunk");
			SnapshotFilterSpecDataObj snapshotFilter = new SnapshotFilterSpecDataObj();
			List<SnapshotIdDataObj> snapshots = configurationService.getSnapshotsForStream(streamId,snapshotFilter);
			System.out.println("------------getSnapshotsForStream");
			
			//getStreamDefects
			MergedDefectIdDataObj mdid0 = new MergedDefectIdDataObj();
			mdid0.setCid((long) 10641);
			List<MergedDefectIdDataObj> mdids= new ArrayList<MergedDefectIdDataObj>();
			mdids.add(mdid0);
			StreamIdDataObj  streamId0 = new StreamIdDataObj();
			streamId0.setName("gzip-trunk");
			List<StreamIdDataObj> streamIdList= new ArrayList<StreamIdDataObj>();
			streamIdList.add(streamId);
			StreamDefectFilterSpecDataObj streamDefectFilter = new StreamDefectFilterSpecDataObj();
			streamDefectFilter.getStreamIdList().add(streamId0);
			streamDefectFilter.setIncludeDefectInstances(true);
			List<StreamDefectDataObj> streamDefects = defectService.getStreamDefects(mdids,streamDefectFilter);
			System.out.println("------------getStreamDefects");
			for (StreamDefectDataObj streamDefect : streamDefects) {
				List<DefectInstanceDataObj> defectInstances=streamDefect.getDefectInstances();
				for (DefectInstanceDataObj defectInstance : defectInstances) {
					List<EventDataObj> events=defectInstance.getEvents();
					for (EventDataObj event : events) {
						if (event.isMain()){
							FileIdDataObj fileId_=event.getFileId();
							String md5=fileId_.getContentsMD5();
							String path=fileId_.getFilePathname(); 
							System.out.println(path+"|"+ md5+"|"+event.getLineNumber());							
						}
					}	
				}
			}

			//getStreams
			StreamFilterSpecDataObj streamFilter = new StreamFilterSpecDataObj();
			streamFilter.setNamePattern("*");
			List<StreamDataObj> streams = configurationService.getStreams(streamFilter);
			System.out.println("------------getStreams");
			
			//getSystemConfig
			ConfigurationDataObj  systemConfiguration=configurationService.getSystemConfig();
			System.out.println("------------getSystemConfig");
			
			//getTrendRecordsForProject
			ProjectIdDataObj projectId= new ProjectIdDataObj();
			projectId.setName("gzip");
			ProjectTrendRecordFilterSpecDataObj trendRecordFilter= new ProjectTrendRecordFilterSpecDataObj();
			List<ProjectMetricsDataObj> projectMetrics= defectService.getTrendRecordsForProject(projectId,trendRecordFilter);
			System.out.println("------------getTrendRecordsForProject");
			
			//getTriageHistory
			MergedDefectIdDataObj mdid = new MergedDefectIdDataObj();
			mdid.setCid((long) 10641);
			TriageStoreIdDataObj triageStoreId= new TriageStoreIdDataObj();
			triageStoreId.setName("Default Triage Store");
			List<TriageStoreIdDataObj> triageStoreIds =new ArrayList<TriageStoreIdDataObj>();
			triageStoreIds.add(triageStoreId);
			List <TriageHistoryDataObj> triageHistory = defectService.getTriageHistory(mdid, triageStoreIds );
			System.out.println("------------getTriageHistory");
			
			//getTriageStores
			TriageStoreFilterSpecDataObj triageStoreFilter = new TriageStoreFilterSpecDataObj();
			List<TriageStoreDataObj> triageStores = configurationService.getTriageStores(triageStoreFilter);
			System.out.println("------------getTriageStores");
			
			//getUser
			UserDataObj userInfo = configurationService.getUser("admin");
			System.out.println("------------getUser");
			
			//getUsers
			UserFilterSpecDataObj userFilter= new UserFilterSpecDataObj();
			UsersPageDataObj users = configurationService.getUsers(userFilter,pageSpec);
			System.out.println("------------getUsers");
			
			//getVersion
			VersionDataObj version=configurationService.getVersion();				
			System.out.println("------------getVersion");
			
            System.out.println("Done.");
		
        }
        catch (SOAPFaultException x){
            System.err.println(x);
        }
        catch (WebServiceException x){
            System.err.println(x);
        }
        catch (java.net.MalformedURLException x){
            System.err.println(x);
        }
        catch (CovRemoteServiceException_Exception x){
            System.err.println(x);
        }
	}
    static DefectService getDS(String serverAddr,
                               String user,
                               String password) throws java.net.MalformedURLException {
        DefectServiceService dss = new DefectServiceService(
                new URL("http://" + serverAddr + "/ws/v8/defectservice?wsdl"),
                new QName("http://ws.coverity.com/v8", "DefectServiceService"));
        DefectService ds = dss.getDefectServicePort();

        // Attach an authentication handler to it
        BindingProvider bindingProvider = (BindingProvider) ds;
        bindingProvider.getBinding().setHandlerChain(
                Arrays.asList((Handler) new ClientAuthenticationHandlerWSS(user, password)));

        return ds;
    }
    static ConfigurationService getCS(String serverAddr,
                                      String user,
                                      String password) throws java.net.MalformedURLException {
        ConfigurationServiceService dss = new ConfigurationServiceService(
                new URL("http://" + serverAddr + "/ws/v8/configurationservice?wsdl"),
                new QName("http://ws.coverity.com/v8", "ConfigurationServiceService"));
        ConfigurationService ds = dss.getConfigurationServicePort();

        // Attach an authentication handler to it
        BindingProvider bindingProvider = (BindingProvider) ds;
        bindingProvider.getBinding().setHandlerChain(
                Arrays.asList((Handler) new ClientAuthenticationHandlerWSS(user, password)));

        return ds;
    }
	static byte[] decompressByteArray(byte[] bytes){
         
        ByteArrayOutputStream baos = null;
        Inflater iflr = new Inflater();
        iflr.setInput(bytes);
        baos = new ByteArrayOutputStream();
        byte[] tmp = new byte[4*1024];
        try{
            while(!iflr.finished()){
                int size = iflr.inflate(tmp);
                baos.write(tmp, 0, size);
            }
        } catch (Exception ex){
             
        } finally {
            try{
                if(baos != null) baos.close();
            } catch(Exception ex){}
        }
         
        return baos.toByteArray();
    }
	
}