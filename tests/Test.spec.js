import { test, expect } from '@playwright/test';

test('This is 1st test on playwright', async ({ page }) => {
  await page.goto('http://129.150.40.148:8001/login');

  await page.locator("//input[@name='username']").fill('pukatqa-admin');
  await page.locator("//input[@name='password']").fill('12345678');

  await page.click("(//button[@type='submit'])[1]");

  
  const pageTitle = await page.title();

  
  await expect(page).toHaveURL("http://129.150.40.148:8001/admin/dashboard");

  console.log(pageTitle);

  await page.close();
});

test('Verify the URL of Dashboard', async ({ page }) => {
  await page.goto('http://129.150.40.148:8001/login');

  await page.locator("//input[@name='username']").fill('pukatqa-admin');
  await page.locator("//input[@name='password']").fill('12345678');

  await page.click("(//button[@type='submit'])[1]");

  const pageTitle = await page.title();

  await expect(page).toHaveURL("http://129.150.40.148:8001/admin/dashboard");
  console.log(pageTitle);

  await page.close();
});
