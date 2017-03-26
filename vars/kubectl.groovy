def call(String command) {
	stage('kubectl') {
		sh("""#!/bin/bash
			source '/opt/google-cloud-sdk/path.bash.inc'
			set -x
			kubectl ${command}
		""")
	}
}
