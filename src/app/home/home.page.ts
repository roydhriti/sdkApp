// import { Component } from '@angular/core';
// import { dhriticlass } from '@dhriti/dhritiplugin/src';
// import { AlertController } from '@ionic/angular';

// @Component({
//   selector: 'app-home',
//   templateUrl: 'home.page.html',
//   styleUrls: ['home.page.scss'],
// })
// export class HomePage {
//   constructor(private alertController: AlertController) {}

//   async triggerSdk() {
//     try {
//       await dhriticlass.lunch();
//       this.showAlert('Success', 'Onboarding SDK triggered successfully!');
//       console.log('SDK launched successfully');
//     } catch (error) {
//       console.error('Failed to launch SDK:', error);
//       this.showAlert('Failed', 'Onboarding SDK triggered failed!');
//     }
//   }

//   async showAlert(header: string, message: string) {
//     const alert = await this.alertController.create({
//       header: header,
//       message: message,
//       buttons: ['OK'],
//     });
//     await alert.present();
//   }
// }

import { Component } from '@angular/core';
import { AlertController } from '@ionic/angular';
import Sdk from 'sdk-plugin/src';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  constructor(private alertController: AlertController) {}

  async triggerSdk() {
    try {
      await Sdk.lunch(); // Call `lunch` directly on `Sdk`
      this.showAlert('Success', 'SDK triggered successfully!');
    } catch (error) {
      console.error('Failed to launch SDK:', error);
      this.showAlert('Error', 'Failed to trigger SDK.');
    }
  }

  async showAlert(header: string, message: string) {
    const alert = await this.alertController.create({
      header,
      message,
      buttons: ['OK'],
    });
    await alert.present();
  }
}
