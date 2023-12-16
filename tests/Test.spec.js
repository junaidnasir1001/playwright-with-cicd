const{test,expect}=require('@playwright/test')

test('This is 1st test on playwright',async ({page})=>{

   await page.goto('http://129.150.40.148:8001/login');

   await page.locator("//input[@name='username']").fill('pukatqa-admin');
   await page.locator("//input[@name='password']").fill('12345678');

   await page.click("(//button[@type='submit'])[1]")

//just for webhook testing
   // await page.getByRole('input',{name:'username'}).fill('pukatqa-admin')

   const pageTitle = page.title();

   await expect(page).toHaveURL("http://129.150.40.148:8001/admin/dashboard");

   console.log( pageTitle)

   await page.close();


})
