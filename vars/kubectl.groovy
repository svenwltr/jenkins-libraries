def call(String command) {
	sh("""#!/bin/bash
		source '/opt/google-cloud-sdk/path.bash.inc'
		set -x
		kubectl ${command}
	""")
}
