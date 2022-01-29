# CreateLibrary1
Step 1. Add the JitPack repository to your build file
gradle
'''allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  Step 2. Add the dependency
  '''
  dependencies {
	        implementation 'com.github.Ilhomjon1502:CreateLibrary1:1.0.0'
	}
