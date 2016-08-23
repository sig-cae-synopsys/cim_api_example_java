Notes for Java WS API client example code

When needed, we have examples of the creation of the filter, spec, etc. objects, however usually in the simplest form.
Processing of the results is demonstrated with commented out print commands.
For additional fields of the spec and result objects, refer to the full API documentation.

Only the necessary class and function definitions are provided, the API calls themselves are intended as example snippets.
Helper functions, classes, call parameters, modularization are left to the implementers for simplicity and clarity.
Create update delete calls involve the same spec object creations (see API reference), they are not provided here.


BUILD:
build.xml has the following ant targets:

ant clean     /removes the bin directory
ant init      /creates the bin directory
ant build     /compiles WsGetAll.java from the src/webService
ant jar       /creates a distributable wsgetAll.jar with the necessary libraries included
ant runclass  /runs the WsGetAll.class from bin/webService with proper classpath
ant run       /builds and runs the distributable jar

HINT:
Because of the target dependencies: 
ant clean
ant jar 
and you're done.

USAGE:
java -jar ./wsgetAll.jar <server-address>:<port> <user> <password>

TODO:

For testing the individual call examples adjust in the source file the example project, stream, defect #specifics to match your projects, streams, etc...

projectname='gzip' # use the getProjects call if don't have one ready
streamnamepattern='gz*'
streamname='gzip-trunk-misra' # use getStreams with streamnamepattern if you don't have one ready
snapshotid=10006 #use getSnapshotsForStream if you don't have one ready

For getFileContents (use getStreamDefects  v[0].defectInstances[0].events[0].fileId.contentsMD5 and filePathname)
filepath='/idirs-7.7.0-misra/gzip-trunk-misra/lib/quotearg.c'
filecontentsMD5='cd583eecf0af533e6f93f31bb7390065'

componentname1='gzip.lib' # use getComponentMaps, getComponent if you don't have one ready
componentname2='gzip.Other'

For a cid which has instances, triage and detectionhistory
cid=10161  # use one of the getMergedDefect calls if don't have one ready


EXAMPLE CALLS:

getAllLdapConfigurations
getAllPermissions
getAllRoles
getAttributes
getBackupConfiguration
getCategoryNames
getCheckerNames
getCommitState
getComponent
getComponentMaps
getDefectStatuses
getGroup
getGroups
getLastUpdateTimes
getLdapServerDomains
getLicenseConfiguration
getLicenseState
getLoggingConfiguration
getProjects
getRole
getServerTime
getSignInConfiguration
getSkeletonizationConfiguration
getSnapshotInformation
getSnapshotPurgeDetails
getSnapshotsForStream
getStreams
getSystemConfig
getTriageStores
getTypeNames
getUser
getUsers
getVersion
getComponentMetricsForProject
getFileContents
getMergedDefectDetectionHistory
getMergedDefectHistory
getMergedDefectsForProjectScope
getMergedDefectsForStreams
getMergedDefectsForSnapshotScope
getStreamDefects
