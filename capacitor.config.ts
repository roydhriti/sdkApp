// import type { CapacitorConfig } from '@capacitor/cli';

// const config: CapacitorConfig = {
//   appId: 'io.ionic.starter',
//   appName: 'sdkAPP',
//   webDir: 'www'
// };

// export default config;

import type { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'io.ionic.starter',
  appName: 'sdkAPP',
  webDir: 'www',
  server: {
    androidScheme: 'https',
  },
};

export default config;
