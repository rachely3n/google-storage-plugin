pipeline {
//step([$class: 'ClassicUploadStep', credentialsId: env.JENKINS_TEST_CRED_ID, bucket: "gs://${JENKINS_TEST_BUCKET}", pattern: env.BUILD_CONTEXT])

    agent any
//    change stuff here
    stages {
        stage('Store to GCS') {
            steps{
                step([$class: 'ClassicUploadStep', credentialsId: env
                        .CREDENTIALS_ID,  bucket: "gs://${env.BUCKET}",
                      pattern: env.PATTERN])
            }
        }
    }
}