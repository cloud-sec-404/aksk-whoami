# aksk whoami

# 一、这是什么？

渗透的时候经常会出现拿到了一些access key、secret key、token之类的，
但是并不知道这具体是哪个服务的认证，这个工具就是解决这个问题的，大力出奇迹，
把认证方式拿市面上常见的服务都试一次，看看谁能怼进去，简单粗暴有效。

# 二、快速开始

```bash
java -jar aksk-whoami.jar -ak xxx -sk xxx
```

# 三、支持云厂商列表
此列表由大模型生成，支持过程中会不断调整优化。
### 1. 云服务提供商
- [x] 1. 阿里云
- [ ] 2. 腾讯云
- [ ] 3. 华为云
- [ ] 4. 百度智能云
- [ ] 5. 京东云
- [ ] 6. 金山云
- [ ] 7. 浪潮云
- [ ] 8. 天翼云
- [ ] 9. 移动云
- [ ] 10. 联通云
- [ ] 11. AWS (Amazon Web Services)
- [ ] 12. Microsoft Azure
- [ ] 13. Google Cloud Platform
- [ ] 14. IBM Cloud
- [ ] 15. Oracle Cloud
- [ ] 16. Salesforce
- [ ] 17. VMware
- [ ] 18. Rackspace
- [ ] 19. DigitalOcean
- [ ] 20. Linode

### 2. 社交媒体平台
- [ ] 21. Facebook Graph API
- [ ] 22. Twitter API
- [ ] 23. Instagram API
- [ ] 24. LinkedIn API
- [ ] 25. Pinterest API
- [ ] 26. Reddit API
- [ ] 27. Tumblr API
- [ ] 28. VKontakte API
- [ ] 29. Weibo API
- [ ] 30. Douyin API

### 3. 通信服务
- [ ] 31. WhatsApp Business API
- [ ] 32. Telegram Bot API
- [ ] 33. Slack API
- [ ] 34. Discord API
- [ ] 35. WeChat API
- [ ] 36. QQ API
- [ ] 37. LINE API
- [ ] 38. Skype API
- [ ] 39. Zoom API
- [ ] 40. Twilio API

### 4. 支付服务
- [ ] 41. PayPal API
- [ ] 42. Stripe API
- [ ] 43. Alipay API
- [ ] 44. WeChat Pay API
- [ ] 45. Apple Pay API
- [ ] 46. Google Pay API
- [ ] 47. Square API
- [ ] 48. Adyen API
- [ ] 49. Braintree API
- [ ] 50. Dwolla API

### 5. 物流和运输服务
- [ ] 51. FedEx API
- [ ] 52. UPS API
- [ ] 53. DHL API
- [ ] 54. USPS API
- [ ] 55. SF Express API
- [ ] 56. Cainiao Network API
- [ ] 57. JD Logistics API
- [ ] 58. YTO Express API
- [ ] 59. ZTO Express API
- [ ] 60. Yunda Express API

### 6. 地图和导航服务
- [ ] 61. Google Maps API
- [ ] 62. Bing Maps API
- [ ] 63. Mapbox API
- [ ] 64. Here Technologies API
- [ ] 65. OpenStreetMap API
- [ ] 66. Baidu Maps API
- [ ] 67. Amap (高德地图) API
- [ ] 68. Tencent Maps API
- [ ] 69. Didi Chuxing API
- [ ] 70. NavInfo (四维图新) API

### 7. 数据分析和大数据服务
- [ ] 71. Tableau API
- [ ] 72. Power BI API
- [ ] 73. Looker API
- [ ] 74. Google Analytics API
- [ ] 75. Mixpanel API
- [ ] 76. Amplitude API
- [ ] 77. Segment API
- [ ] 78. Snowflake API
- [ ] 79. MongoDB Atlas API
- [ ] 80. Elasticsearch API

### 8. 内容分发网络 (CDN)
- [ ] 81. Akamai API
- [ ] 82. Cloudflare API
- [ ] 83. Fastly API
- [ ] 84. StackPath API
- [ ] 85. Edgecast API
- [ ] 86. Netlify API
- [ ] 87. Vercel API
- [ ] 88. CDN77 API
- [ ] 89. KeyCDN API
- [ ] 90. CloudFront (AWS)

### 9. 金融服务
- [ ] 91. Bloomberg API
- [ ] 92. Reuters API
- [ ] 93. Xignite API
- [ ] 94. Alpha Vantage API
- [ ] 95. IEX Cloud API
- [ ] 96. Yahoo Finance API
- [ ] 97. Finnhub API
- [ ] 98. EOD Historical Data API
- [ ] 99. Intrinio API
- [ ] 100. OpenFIGI API

### 10. 电子商务平台
- [ ] 101. eBay API
- [ ] 102. Amazon MWS API
- [ ] 103. Shopify API
- [ ] 104. WooCommerce API
- [ ] 105. Magento API
- [ ] 106. BigCommerce API
- [ ] 107. PrestaShop API
- [ ] 108. OpenCart API
- [ ] 109. Volusion API
- [ ] 110. 3dcart API

### 11. 人力资源管理
- [ ] 111. Workday API
- [ ] 112. BambooHR API
- [ ] 113. ADP API
- [ ] 114. Paychex API
- [ ] 115. Gusto API
- [ ] 116. Zenefits API
- [ ] 117. Namely API
- [ ] 118. UltiPro API
- [ ] 119. Workforce Software API
- [ ] 120. Kronos API

### 12. 客户关系管理 (CRM)
- [ ] 121. Salesforce API
- [ ] 122. HubSpot API
- [ ] 123. Zoho CRM API
- [ ] 124. Microsoft Dynamics CRM API
- [ ] 125. SugarCRM API
- [ ] 126. SuiteCRM API
- [ ] 127. Insightly API
- [ ] 128. Agile CRM API
- [ ] 129. Bitrix24 API
- [ ] 130. Pipedrive API

### 13. 项目管理
- [ ] 131. Asana API
- [ ] 132. Trello API
- [ ] 133. Basecamp API
- [ ] 134. Monday.com API
- [ ] 135. Wrike API
- [ ] 136. Smartsheet API
- [ ] 137. Teamwork API
- [ ] 138. Podio API
- [ ] 139. Airtable API
- [ ] 140. ClickUp API

### 14. 教育
- [ ] 141. Canvas API
- [ ] 142. Blackboard API
- [ ] 143. Moodle API
- [ ] 144. Schoology API
- [ ] 145. Google Classroom API
- [ ] 146. Clever API
- [ ] 147. Instructure API
- [ ] 148. Brightspace (D2L) API
- [ ] 149. Edmodo API
- [ ] 150. Google Workspace for Education API

### 15. 医疗健康
- [ ] 151. Epic API
- [ ] 152. Cerner API
- [ ] 153. Athenahealth API
- [ ] 154. McKesson API
- [ ] 155. Meditech API
- [ ] 156. Allscripts API
- [ ] 157. Greenway API
- [ ] 158. eClinicalWorks API
- [ ] 159. NextGen API
- [ ] 160. Medisafe API

### 16. 物联网 (IoT)
- [ ] 161. AWS IoT API
- [ ] 162. Microsoft Azure IoT API
- [ ] 163. Google Cloud IoT API
- [ ] 164. IBM Watson IoT API
- [ ] 165. Arduino API
- [ ] 166. Particle API
- [ ] 167. ThingWorx API
- [ ] 168. Electric Imp API
- [ ] 169. Temboo API
- [ ] 170. Xively API

### 17. 媒体和娱乐
- [ ] 171. Spotify API
- [ ] 172. Netflix API
- [ ] 173. Hulu API
- [ ] 174. Twitch API
- [ ] 175. YouTube API
- [ ] 176. Vimeo API
- [ ] 177. Dailymotion API
- [ ] 178. SoundCloud API
- [ ] 179. Deezer API
- [ ] 180. TuneIn API

### 18. 广告和营销
- [ ] 181. Google Ads API
- [ ] 182. Facebook Ads API
- [ ] 183. Twitter Ads API
- [ ] 184. LinkedIn Ads API
- [ ] 185. Microsoft Advertising API
- [ ] 186. AdRoll API
- [ ] 187. Criteo API
- [ ] 188. DoubleClick API
- [ ] 189. AdWords API
- [ ] 190. Bing Ads API

### 19. 安全和身份验证
- [ ] 191. Okta API
- [ ] 192. Auth0 API
- [ ] 193. Firebase Authentication API
- [ ] 194. AWS Cognito API
- [ ] 195. Microsoft Azure Active Directory API
- [ ] 196. Google Identity Platform API
- [ ] 197. OneLogin API
- [ ] 198. Ping Identity API
- [ ] 199. Keycloak API
- [ ] 200. Stormpath API

### 20. 法律和合规
- [ ] 201. LexisNexis API
- [ ] 202. Westlaw API
- [ ] 203. Bloomberg Law API
- [ ] 204. CourtListener API
- [ ] 205. Justia API
- [ ] 206. LegalHold API
- [ ] 207. Relativity API
- [ ] 208. Everlaw API
- [ ] 209. Case.one API
- [ ] 210. LawGeex API

### 21. 政府和公共数据
- [ ] 211. Data.gov API
- [ ] 212. UK Government API
- [ ] 213. European Union Open Data Portal API
- [ ] 214. New Zealand Government Data API
- [ ] 215. Australian Government Data API
- [ ] 216. Canadian Government Data API
- [ ] 217. US Census Bureau API
- [ ] 218. US National Weather Service API
- [ ] 219. US Geological Survey API
- [ ] 220. US Federal Election Commission API

### 22. 旅游和酒店
- [ ] 221. Expedia API
- [ ] 222. Booking.com API
- [ ] 223. Airbnb API
- [ ] 224. TripAdvisor API
- [ ] 225. Agoda API
- [ ] 226. Kayak API
- [ ] 227. Skyscanner API
- [ ] 228. Amadeus API
- [ ] 229. Sabre API
- [ ] 230. Travelport API

### 23. 汽车和交通
- [ ] 231. Tesla API
- [ ] 232. Uber API
- [ ] 233. Lyft API
- [ ] 234. Didi Chuxing API
- [ ] 235. Grab API
- [ ] 236. Ola API
- [ ] 237. BMW API
- [ ] 238. Mercedes-Benz API
- [ ] 239. Ford API
- [ ] 240. General Motors API

### 24. 房地产
- [ ] 241. Zillow API
- [ ] 242. Redfin API
- [ ] 243. Realtor.com API
- [ ] 244. Trulia API
- [ ] 245. Movoto API
- [ ] 246. Homes.com API
- [ ] 247. LoopNet API
- [ ] 248. CoStar API
- [ ] 249. Xceligent API
- [ ] 250. Zoopla API

### 25. 农业
- [ ] 251. The Climate Corporation API
- [ ] 252. FarmLogs API
- [ ] 253. Granular API
- [ ] 254. Conservis API
- [ ] 255. Agworld API
- [ ] 256. AgriWebb API
- [ ] 257. OnFarm API
- [ ] 258. FarmWizard API
- [ ] 259. Cropio API
- [ ] 260. FarmERP API

### 26. 能源和环境
- [ ] 261. Green Button API
- [ ] 262. EnergyOS API
- [ ] 263. Enedis API
- [ ] 264. OpenEI API
- [ ] 265. Open Power System Data API
- [ ] 266. Open Grid Scheduler API
- [ ] 267. Open Energy Data API
- [ ] 268. Open Smart Grid API
- [ ] 269. OpenADR API
- [ ] 270. OpenWeatherMap API

### 27. 科学和研究
- [ ] 271. NASA API
- [ ] 272. NOAA API
- [ ] 273. USGS API
- [ ] 274. European Space Agency API
- [ ] 275. CERN Open Data Portal API
- [ ] 276. Allen Institute for Brain Science API
- [ ] 277. Human Connectome Project API
- [ ] 278. Protein Data Bank API
- [ ] 279. GenBank API
- [ ] 280. Ensembl API

### 28. 教育技术
- [ ] 281. Moodle API
- [ ] 282. Canvas LMS API
- [ ] 283. Blackboard Learn API
- [ ] 284. Brightspace (D2L) API
- [ ] 285. Schoology API
- [ ] 286. Google Classroom API
- [ ] 287. Clever API
- [ ] 288. Instructure Canvas API
- [ ] 289. Edmodo API
- [ ] 290. Google Workspace for Education API

### 29. 游戏
- [ ] 291. Steam API
- [ ] 292. Twitch API
- [ ] 293. PlayStation API
- [ ] 294. Xbox Live API
- [ ] 295. Nintendo Switch API
- [ ] 296. Epic Games API
- [ ] 297. Riot Games API
- [ ] 298. Valve API
- [ ] 299. GameSpot API
- [ ] 300. IGN API

### 30. 健康和健身
- [ ] 301. Fitbit API
- [ ] 302. Garmin API
- [ ] 303. MyFitnessPal API
- [ ] 304. Withings API
- [ ] 305. Jawbone API
- [ ] 306. Google Fit API
- [ ] 307. Apple HealthKit API
- [ ] 308. Samsung Health API
- [ ] 309. Microsoft HealthVault API
- [ ] 310. Fitbit Health Solutions API

### 31. 视频和直播
- [ ] 311. YouTube API
- [ ] 312. Vimeo API
- [ ] 313. Dailymotion API
- [ ] 314. Twitch API
- [ ] 315. Periscope API
- [ ] 316. Livestream API
- [ ] 317. Dacast API
- [ ] 318. Wowza Streaming Engine API
- [ ] 319. Kaltura API
- [ ] 320. JW Player API

### 32. 音乐和音频
- [ ] 321. Spotify API
- [ ] 322. SoundCloud API
- [ ] 323. Deezer API
- [ ] 324. TuneIn API
- [ ] 325. Pandora API
- [ ] 326. Apple Music API
- [ ] 327. Google Play Music API
- [ ] 328. Amazon Music API
- [ ] 329. Tidal API
- [ ] 330. Napster API

### 33. 照片和图像
- [ ] 331. Flickr API
- [ ] 332. Instagram API
- [ ] 333. Imgur API
- [ ] 334. 500px API
- [ ] 335. Getty Images API
- [ ] 336. Shutterstock API
- [ ] 337. Adobe Stock API
- [ ] 338. iStock API
- [ ] 339. Unsplash API
- [ ] 340. Pixabay API

### 34. 写作和文档
- [ ] 341. Google Docs API
- [ ] 342. Microsoft Word API
- [ ] 343. Dropbox Paper API
- [ ] 344. Quip API
- [ ] 345. Evernote API
- [ ] 346. OneNote API
- [ ] 347. Google Keep API
- [ ] 348. Simplenote API
- [ ] 349. Notion API
- [ ] 350. Bear App API

### 35. 翻译和语言处理
- [ ] 351. Google Translate API
- [ ] 352. Microsoft Translator API
- [ ] 353. Amazon Translate API
- [ ] 354. IBM Watson Language Translator API
- [ ] 355. DeepL API
- [ ] 356. Yandex Translate API
- [ ] 357. SDL Language Cloud API
- [ ] 358. Linguee API
- [ ] 359. Reverso API
- [ ] 360. Translated API

### 36. 搜索和索引
- [ ] 361. Elasticsearch API
- [ ] 362. Solr API
- [ ] 363. Apache Lucene API
- [ ] 364. Algolia API
- [ ] 365. Swiftype API
- [ ] 366. SiteSearch API
- [ ] 367. Google Custom Search API
- [ ] 368. Bing Search API
- [ ] 369. DuckDuckGo API
- [ ] 370. Exalead API

### 37. 电子商务
- [ ] 371. eBay API
- [ ] 372. Amazon MWS API
- [ ] 373. Shopify API
- [ ] 374. WooCommerce API
- [ ] 375. Magento API
- [ ] 376. BigCommerce API
- [ ] 377. PrestaShop API
- [ ] 378. OpenCart API
- [ ] 379. Volusion API
- [ ] 380. 3dcart API

### 38. 供应链管理
- [ ] 381. SAP Ariba API
- [ ] 382. Oracle SCM Cloud API
- [ ] 383. Infor SCM API
- [ ] 384. JDA API
- [ ] 385. Manhattan Associates API
- [ ] 386. Blue Ridge API
- [ ] 387. E2open API
- [ ] 388. HighJump API
- [ ] 389. Kinaxis API
- [ ] 390. Logility API

### 39. 财务管理
- [ ] 391. Xero API
- [ ] 392. QuickBooks API
- [ ] 393. FreshBooks API
- [ ] 394. Wave API
- [ ] 395. Zoho Books API
- [ ] 396. Sage Business Cloud Accounting API
- [ ] 397. Yodlee API
- [ ] 398. Plaid API
- [ ] 399. Mint API
- [ ] 400. Expensify API

### 40. 人力资源管理
- [ ] 401. Workday API
- [ ] 402. BambooHR API
- [ ] 403. ADP API
- [ ] 404. Paychex API
- [ ] 405. Gusto API
- [ ] 406. Zenefits API
- [ ] 407. Namely API
- [ ] 408. UltiPro API
- [ ] 409. Workforce Software API
- [ ] 410. Kronos API

### 41. 客户关系管理 (CRM)
- [ ] 411. Salesforce API
- [ ] 412. HubSpot API
- [ ] 413. Zoho CRM API
- [ ] 414. Microsoft Dynamics CRM API
- [ ] 415. SugarCRM API
- [ ] 416. SuiteCRM API
- [ ] 417. Insightly API
- [ ] 418. Agile CRM API
- [ ] 419. Bitrix24 API
- [ ] 420. Pipedrive API

### 42. 项目管理
- [ ] 421. Asana API
- [ ] 422. Trello API
- [ ] 423. Basecamp API
- [ ] 424. Monday.com API
- [ ] 425. Wrike API
- [ ] 426. Smartsheet API
- [ ] 427. Teamwork API
- [ ] 428. Podio API
- [ ] 429. Airtable API
- [ ] 430. ClickUp API

### 43. 教育
- [ ] 431. Canvas API
- [ ] 432. Blackboard API
- [ ] 433. Moodle API
- [ ] 434. Schoology API
- [ ] 435. Google Classroom API
- [ ] 436. Clever API
- [ ] 437. Instructure API
- [ ] 438. Brightspace (D2L) API
- [ ] 439. Edmodo API
- [ ] 440. Google Workspace for Education API

### 44. 医疗健康
- [ ] 441. Epic API
- [ ] 442. Cerner API
- [ ] 443. Athenahealth API
- [ ] 444. McKesson API
- [ ] 445. Meditech API
- [ ] 446. Allscripts API
- [ ] 447. Greenway API
- [ ] 448. eClinicalWorks API
- [ ] 449. NextGen API
- [ ] 450. Medisafe API

### 45. 物联网 (IoT)
- [ ] 451. AWS IoT API
- [ ] 452. Microsoft Azure IoT API
- [ ] 453. Google Cloud IoT API
- [ ] 454. IBM Watson IoT API
- [ ] 455. Arduino API
- [ ] 456. Particle API
- [ ] 457. ThingWorx API
- [ ] 458. Electric Imp API
- [ ] 459. Temboo API
- [ ] 460. Xively API

### 46. 媒体和娱乐
- [ ] 461. Spotify API
- [ ] 462. Netflix API
- [ ] 463. Hulu API
- [ ] 464. Twitch API
- [ ] 465. YouTube API
- [ ] 466. Vimeo API
- [ ] 467. Dailymotion API
- [ ] 468. SoundCloud API
- [ ] 469. Deezer API
- [ ] 470. TuneIn API

### 47. 广告和营销
- [ ] 471. Google Ads API
- [ ] 472. Facebook Ads API
- [ ] 473. Twitter Ads API
- [ ] 474. LinkedIn Ads API
- [ ] 475. Microsoft Advertising API
- [ ] 476. AdRoll API
- [ ] 477. Criteo API
- [ ] 478. DoubleClick API
- [ ] 479. AdWords API
- [ ] 480. Bing Ads API

### 48. 安全和身份验证
- [ ] 481. Okta API
- [ ] 482. Auth0 API
- [ ] 483. Firebase Authentication API
- [ ] 484. AWS Cognito API
- [ ] 485. Microsoft Azure Active Directory API
- [ ] 486. Google Identity Platform API
- [ ] 487. OneLogin API
- [ ] 488. Ping Identity API
- [ ] 489. Keycloak API
- [ ] 490. Stormpath API

### 49. 法律和合规
- [ ] 491. LexisNexis API
- [ ] 492. Westlaw API
- [ ] 493. Bloomberg Law API
- [ ] 494. CourtListener API
- [ ] 495. Justia API
- [ ] 496. LegalHold API
- [ ] 497. Relativity API
- [ ] 498. Everlaw API
- [ ] 499. Case.one API
- [ ] 500. LawGeex API

### 50. 政府和公共数据
- [ ] 501. Data.gov API
- [ ] 502. UK Government API
- [ ] 503. European Union Open Data Portal API
- [ ] 504. New Zealand Government Data API
- [ ] 505. Australian Government Data API
- [ ] 506. Canadian Government Data API
- [ ] 507. US Census Bureau API
- [ ] 508. US National Weather Service API
- [ ] 509. US Geological Survey API
- [ ] 510. US Federal Election Commission API

### 51. 旅游和酒店
- [ ] 511. Expedia API
- [ ] 512. Booking.com API
- [ ] 513. Airbnb API
- [ ] 514. TripAdvisor API
- [ ] 515. Agoda API
- [ ] 516. Kayak API
- [ ] 517. Skyscanner API
- [ ] 518. Amadeus API
- [ ] 519. Sabre API
- [ ] 520. Travelport API

### 52. 汽车和交通
- [ ] 521. Tesla API
- [ ] 522. Uber API
- [ ] 523. Lyft API
- [ ] 524. Didi Chuxing API
- [ ] 525. Grab API
- [ ] 526. Ola API
- [ ] 527. BMW API
- [ ] 528. Mercedes-Benz API
- [ ] 529. Ford API
- [ ] 530. General Motors API

### 53. 房地产
- [ ] 531. Zillow API
- [ ] 532. Redfin API
- [ ] 533. Realtor.com API
- [ ] 534. Trulia API
- [ ] 535. Movoto API
- [ ] 536. Homes.com API
- [ ] 537. LoopNet API
- [ ] 538. CoStar API
- [ ] 539. Xceligent API
- [ ] 540. Zoopla API

### 54. 农业
- [ ] 541. The Climate Corporation API
- [ ] 542. FarmLogs API
- [ ] 543. Granular API
- [ ] 544. Conservis API
- [ ] 545. Agworld API
- [ ] 546. AgriWebb API
- [ ] 547. OnFarm API
- [ ] 548. FarmWizard API
- [ ] 549. Cropio API
- [ ] 550. FarmERP API

### 55. 能源和环境
- [ ] 551. Green Button API
- [ ] 552. EnergyOS API
- [ ] 553. Enedis API
- [ ] 554. OpenEI API
- [ ] 555. Open Power System Data API
- [ ] 556. Open Grid Scheduler API
- [ ] 557. Open Energy Data API
- [ ] 558. Open Smart Grid API
- [ ] 559. OpenADR API
- [ ] 560. OpenWeatherMap API

### 56. 科学和研究
- [ ] 561. NASA API
- [ ] 562. NOAA API
- [ ] 563. USGS API
- [ ] 564. European Space Agency API
- [ ] 565. CERN Open Data Portal API
- [ ] 566. Allen Institute for Brain Science API
- [ ] 567. Human Connectome Project API
- [ ] 568. Protein Data Bank API
- [ ] 569. GenBank API
- [ ] 570. Ensembl API

### 57. 教育技术
- [ ] 571. Moodle API
- [ ] 572. Canvas LMS API
- [ ] 573. Blackboard Learn API
- [ ] 574. Brightspace (D2L) API
- [ ] 575. Schoology API
- [ ] 576. Google Classroom API
- [ ] 577. Clever API
- [ ] 578. Instructure Canvas API
- [ ] 579. Edmodo API
- [ ] 580. Google Workspace for Education API

### 58. 游戏
- [ ] 581. Steam API
- [ ] 582. Twitch API
- [ ] 583. PlayStation API
- [ ] 584. Xbox Live API
- [ ] 585. Nintendo Switch API
- [ ] 586. Epic Games API
- [ ] 587. Riot Games API
- [ ] 588. Valve API
- [ ] 589. GameSpot API
- [ ] 590. IGN API

### 59. 健康和健身
- [ ] 591. Fitbit API
- [ ] 592. Garmin API
- [ ] 593. MyFitnessPal API
- [ ] 594. Withings API
- [ ] 595. Jawbone API
- [ ] 596. Google Fit API
- [ ] 597. Apple HealthKit API
- [ ] 598. Samsung Health API
- [ ] 599. Microsoft HealthVault API
- [ ] 600. Fitbit Health Solutions API

### 60. 视频和直播
- [ ] 601. YouTube API
- [ ] 602. Vimeo API
- [ ] 603. Dailymotion API
- [ ] 604. Twitch API
- [ ] 605. Periscope API
- [ ] 606. Livestream API
- [ ] 607. Dacast API
- [ ] 608. Wowza Streaming Engine API
- [ ] 609. Kaltura API
- [ ] 610. JW Player API

### 61. 音乐和音频
- [ ] 611. Spotify API
- [ ] 612. SoundCloud API
- [ ] 613. Deezer API
- [ ] 614. TuneIn API
- [ ] 615. Pandora API
- [ ] 616. Apple Music API
- [ ] 617. Google Play Music API
- [ ] 618. Amazon Music API
- [ ] 619. Tidal API
- [ ] 620. Napster API

### 62. 照片和图像
- [ ] 621. Flickr API
- [ ] 622. Instagram API
- [ ] 623. Imgur API
- [ ] 624. 500px API
- [ ] 625. Getty Images API
- [ ] 626. Shutterstock API
- [ ] 627. Adobe Stock API
- [ ] 628. iStock API
- [ ] 629. Unsplash API
- [ ] 630. Pixabay API

### 63. 写作和文档
- [ ] 631. Google Docs API
- [ ] 632. Microsoft Word API
- [ ] 633. Dropbox Paper API
- [ ] 634. Quip API
- [ ] 635. Evernote API
- [ ] 636. OneNote API
- [ ] 637. Google Keep API
- [ ] 638. Simplenote API
- [ ] 639. Notion API
- [ ] 640. Bear App API

### 64. 翻译和语言处理
- [ ] 641. Google Translate API
- [ ] 642. Microsoft Translator API
- [ ] 643. Amazon Translate API
- [ ] 644. IBM Watson Language Translator API
- [ ] 645. DeepL API
- [ ] 646. Yandex Translate API
- [ ] 647. SDL Language Cloud API
- [ ] 648. Linguee API
- [ ] 649. Reverso API
- [ ] 650. Translated API

### 65. 搜索和索引
- [ ] 651. Elasticsearch API
- [ ] 652. Solr API
- [ ] 653. Apache Lucene API
- [ ] 654. Algolia API
- [ ] 655. Swiftype API
- [ ] 656. SiteSearch API
- [ ] 657. Google Custom Search API
- [ ] 658. Bing Search API
- [ ] 659. DuckDuckGo API
- [ ] 660. Exalead API

### 66. 电子商务
- [ ] 661. eBay API
- [ ] 662. Amazon MWS API
- [ ] 663. Shopify API
- [ ] 664. WooCommerce API
- [ ] 665. Magento API
- [ ] 666. BigCommerce API
- [ ] 667. PrestaShop API
- [ ] 668. OpenCart API
- [ ] 669. Volusion API
- [ ] 670. 3dcart API

### 67. 供应链管理
- [ ] 671. SAP Ariba API
- [ ] 672. Oracle SCM Cloud API
- [ ] 673. Infor SCM API
- [ ] 674. JDA API
- [ ] 675. Manhattan Associates API
- [ ] 676. Blue Ridge API
- [ ] 677. E2open API
- [ ] 678. HighJump API
- [ ] 679. Kinaxis API
- [ ] 680. Logility API

### 68. 财务管理
- [ ] 681. Xero API
- [ ] 682. QuickBooks API
- [ ] 683. FreshBooks API
- [ ] 684. Wave API
- [ ] 685. Zoho Books API
- [ ] 686. Sage Business Cloud Accounting API
- [ ] 687. Yodlee API
- [ ] 688. Plaid API
- [ ] 689. Mint API
- [ ] 690. Expensify API

### 69. 人力资源管理
- [ ] 691. Workday API
- [ ] 692. BambooHR API
- [ ] 693. ADP API
- [ ] 694. Paychex API
- [ ] 695. Gusto API
- [ ] 696. Zenefits API
- [ ] 697. Namely API
- [ ] 698. UltiPro API
- [ ] 699. Workforce Software API
- [ ] 700. Kronos API

### 70. 客户关系管理 (CRM)
- [ ] 701. Salesforce API
- [ ] 702. HubSpot API
- [ ] 703. Zoho CRM API
- [ ] 704. Microsoft Dynamics CRM API
- [ ] 705. SugarCRM API
- [ ] 706. SuiteCRM API
- [ ] 707. Insightly API
- [ ] 708. Agile CRM API
- [ ] 709. Bitrix24 API
- [ ] 710. Pipedrive API

### 71. 项目管理
- [ ] 711. Asana API
- [ ] 712. Trello API
- [ ] 713. Basecamp API
- [ ] 714. Monday.com API
- [ ] 715. Wrike API
- [ ] 716. Smartsheet API
- [ ] 717. Teamwork API
- [ ] 718. Podio API
- [ ] 719. Airtable API
- [ ] 720. ClickUp API

### 72. 教育
- [ ] 721. Canvas API
- [ ] 722. Blackboard API
- [ ] 723. Moodle API
- [ ] 724. Schoology API
- [ ] 725. Google Classroom API
- [ ] 726. Clever API
- [ ] 727. Instructure API
- [ ] 728. Brightspace (D2L) API
- [ ] 729. Edmodo API
- [ ] 730. Google Workspace for Education API

### 73. 医疗健康
- [ ] 731. Epic API
- [ ] 732. Cerner API
- [ ] 733. Athenahealth API
- [ ] 734. McKesson API
- [ ] 735. Meditech API
- [ ] 736. Allscripts API
- [ ] 737. Greenway API
- [ ] 738. eClinicalWorks API
- [ ] 739. NextGen API
- [ ] 740. Medisafe API

### 74. 物联网 (IoT)
- [ ] 741. AWS IoT API
- [ ] 742. Microsoft Azure IoT API
- [ ] 743. Google Cloud IoT API
- [ ] 744. IBM Watson IoT API
- [ ] 745. Arduino API
- [ ] 746. Particle API
- [ ] 747. ThingWorx API
- [ ] 748. Electric Imp API
- [ ] 749. Temboo API
- [ ] 750. Xively API

### 75. 媒体和娱乐
- [ ] 751. Spotify API
- [ ] 752. Netflix API
- [ ] 753. Hulu API
- [ ] 754. Twitch API
- [ ] 755. YouTube API
- [ ] 756. Vimeo API
- [ ] 757. Dailymotion API
- [ ] 758. SoundCloud API
- [ ] 759. Deezer API
- [ ] 760. TuneIn API

### 76. 广告和营销
- [ ] 761. Google Ads API
- [ ] 762. Facebook Ads API
- [ ] 763. Twitter Ads API
- [ ] 764. LinkedIn Ads API
- [ ] 765. Microsoft Advertising API
- [ ] 766. AdRoll API
- [ ] 767. Criteo API
- [ ] 768. DoubleClick API
- [ ] 769. AdWords API
- [ ] 770. Bing Ads API

### 77. 安全和身份验证
- [ ] 771. Okta API
- [ ] 772. Auth0 API
- [ ] 773. Firebase Authentication API
- [ ] 774. AWS Cognito API
- [ ] 775. Microsoft Azure Active Directory API
- [ ] 776. Google Identity Platform API
- [ ] 777. OneLogin API
- [ ] 778. Ping Identity API
- [ ] 779. Keycloak API
- [ ] 780. Stormpath API

### 78. 法律和合规
- [ ] 781. LexisNexis API
- [ ] 782. Westlaw API
- [ ] 783. Bloomberg Law API
- [ ] 784. CourtListener API
- [ ] 785. Justia API
- [ ] 786. LegalHold API
- [ ] 787. Relativity API
- [ ] 788. Everlaw API
- [ ] 789. Case.one API
- [ ] 790. LawGeex API

### 79. 政府和公共数据
- [ ] 791. Data.gov API
- [ ] 792. UK Government API
- [ ] 793. European Union Open Data Portal API
- [ ] 794. New Zealand Government Data API
- [ ] 795. Australian Government Data API
- [ ] 796. Canadian Government Data API
- [ ] 797. US Census Bureau API
- [ ] 798. US National Weather Service API
- [ ] 799. US Geological Survey API
- [ ] 800. US Federal Election Commission API

### 80. 旅游和酒店
- [ ] 801. Expedia API
- [ ] 802. Booking.com API
- [ ] 803. Airbnb API
- [ ] 804. TripAdvisor API
- [ ] 805. Agoda API
- [ ] 806. Kayak API
- [ ] 807. Skyscanner API
- [ ] 808. Amadeus API
- [ ] 809. Sabre API
- [ ] 810. Travelport API

### 81. 汽车和交通
- [ ] 811. Tesla API
- [ ] 812. Uber API
- [ ] 813. Lyft API
- [ ] 814. Didi Chuxing API
- [ ] 815. Grab API
- [ ] 816. Ola API
- [ ] 817. BMW API
- [ ] 818. Mercedes-Benz API
- [ ] 819. Ford API
- [ ] 820. General Motors API

### 82. 房地产
- [ ] 821. Zillow API
- [ ] 822. Redfin API
- [ ] 823. Realtor.com API
- [ ] 824. Trulia API
- [ ] 825. Movoto API
- [ ] 826. Homes.com API
- [ ] 827. LoopNet API
- [ ] 828. CoStar API
- [ ] 829. Xceligent API
- [ ] 830. Zoopla API

### 83. 农业
- [ ] 831. The Climate Corporation API
- [ ] 832. FarmLogs API
- [ ] 833. Granular API
- [ ] 834. Conservis API
- [ ] 835. Agworld API
- [ ] 836. AgriWebb API
- [ ] 837. OnFarm API
- [ ] 838. FarmWizard API
- [ ] 839. Cropio API
- [ ] 840. FarmERP API

### 84. 能源和环境
- [ ] 841. Green Button API
- [ ] 842. EnergyOS API
- [ ] 843. Enedis API
- [ ] 844. OpenEI API
- [ ] 845. Open Power System Data API
- [ ] 846. Open Grid Scheduler API
- [ ] 847. Open Energy Data API
- [ ] 848. Open Smart Grid API
- [ ] 849. OpenADR API
- [ ] 850. OpenWeatherMap API

### 85. 科学和研究
- [ ] 851. NASA API
- [ ] 852. NOAA API
- [ ] 853. USGS API
- [ ] 854. European Space Agency API
- [ ] 855. CERN Open Data Portal API
- [ ] 856. Allen Institute for Brain Science API
- [ ] 857. Human Connectome Project API
- [ ] 858. Protein Data Bank API
- [ ] 859. GenBank API
- [ ] 860. Ensembl API

### 86. 教育技术
- [ ] 861. Moodle API
- [ ] 862. Canvas LMS API
- [ ] 863. Blackboard Learn API
- [ ] 864. Brightspace (D2L) API
- [ ] 865. Schoology API
- [ ] 866. Google Classroom API
- [ ] 867. Clever API
- [ ] 868. Instructure Canvas API
- [ ] 869. Edmodo API
- [ ] 870. Google Workspace for Education API

### 87. 游戏
- [ ] 871. Steam API
- [ ] 872. Twitch API
- [ ] 873. PlayStation API
- [ ] 874. Xbox Live API
- [ ] 875. Nintendo Switch API
- [ ] 876. Epic Games API
- [ ] 877. Riot Games API
- [ ] 878. Valve API
- [ ] 879. GameSpot API
- [ ] 880. IGN API

### 88. 健康和健身
- [ ] 881. Fitbit API
- [ ] 882. Garmin API
- [ ] 883. MyFitnessPal API
- [ ] 884. Withings API
- [ ] 885. Jawbone API
- [ ] 886. Google Fit API
- [ ] 887. Apple HealthKit API
- [ ] 888. Samsung Health API
- [ ] 889. Microsoft HealthVault API
- [ ] 890. Fitbit Health Solutions API

### 89. 视频和直播
- [ ] 891. YouTube API
- [ ] 892. Vimeo API
- [ ] 893. Dailymotion API
- [ ] 894. Twitch API
- [ ] 895. Periscope API
- [ ] 896. Livestream API
- [ ] 897. Dacast API
- [ ] 898. Wowza Streaming Engine API
- [ ] 899. Kaltura API
- [ ] 900. JW Player API

### 90. 音乐和音频
- [ ] 901. Spotify API
- [ ] 902. SoundCloud API
- [ ] 903. Deezer API
- [ ] 904. TuneIn API
- [ ] 905. Pandora API
- [ ] 906. Apple Music API
- [ ] 907. Google Play Music API
- [ ] 908. Amazon Music API
- [ ] 909. Tidal API
- [ ] 910. Napster API

### 91. 照片和图像
- [ ] 911. Flickr API
- [ ] 912. Instagram API
- [ ] 913. Imgur API
- [ ] 914. 500px API
- [ ] 915. Getty Images API
- [ ] 916. Shutterstock API
- [ ] 917. Adobe Stock API
- [ ] 918. iStock API
- [ ] 919. Unsplash API
- [ ] 920. Pixabay API

### 92. 写作和文档
- [ ] 921. Google Docs API
- [ ] 922. Microsoft Word API
- [ ] 923. Dropbox Paper API
- [ ] 924. Quip API
- [ ] 925. Evernote API
- [ ] 926. OneNote API
- [ ] 927. Google Keep API
- [ ] 928. Simplenote API
- [ ] 929. Notion API
- [ ] 930. Bear App API

### 93. 翻译和语言处理
- [ ] 931. Google Translate API
- [ ] 932. Microsoft Translator API
- [ ] 933. Amazon Translate API
- [ ] 934. IBM Watson Language Translator API
- [ ] 935. DeepL API
- [ ] 936. Yandex Translate API
- [ ] 937. SDL Language Cloud API
- [ ] 938. Linguee API
- [ ] 939. Reverso API
- [ ] 940. Translated API

### 94. 搜索和索引
- [ ] 941. Elasticsearch API
- [ ] 942. Solr API
- [ ] 943. Apache Lucene API
- [ ] 944. Algolia API
- [ ] 945. Swiftype API
- [ ] 946. SiteSearch API
- [ ] 947. Google Custom Search API
- [ ] 948. Bing Search API
- [ ] 949. DuckDuckGo API
- [ ] 950. Exalead API

### 95. 电子商务
- [ ] 951. eBay API
- [ ] 952. Amazon MWS API
- [ ] 953. Shopify API
- [ ] 954. WooCommerce API
- [ ] 955. Magento API
- [ ] 956. BigCommerce API
- [ ] 957. PrestaShop API
- [ ] 958. OpenCart API
- [ ] 959. Volusion API
- [ ] 960. 3dcart API

### 96. 供应链管理
- [ ] 961. SAP Ariba API
- [ ] 962. Oracle SCM Cloud API
- [ ] 963. Infor SCM API
- [ ] 964. JDA API
- [ ] 965. Manhattan Associates API
- [ ] 966. Blue Ridge API
- [ ] 967. E2open API
- [ ] 968. HighJump API
- [ ] 969. Kinaxis API
- [ ] 970. Logility API

### 97. 财务管理
- [ ] 971. Xero API
- [ ] 972. QuickBooks API
- [ ] 973. FreshBooks API
- [ ] 974. Wave API
- [ ] 975. Zoho Books API
- [ ] 976. Sage Business Cloud Accounting API
- [ ] 977. Yodlee API
- [ ] 978. Plaid API
- [ ] 979. Mint API
- [ ] 980. Expensify API

### 98. 人力资源管理
- [ ] 981. Workday API
- [ ] 982. BambooHR API
- [ ] 983. ADP API
- [ ] 984. Paychex API
- [ ] 985. Gusto API
- [ ] 986. Zenefits API
- [ ] 987. Namely API
- [ ] 988. UltiPro API
- [ ] 989. Workforce Software API
- [ ] 990. Kronos API

### 99. 客户关系管理 (CRM)
- [ ] 991. Salesforce API
- [ ] 992. HubSpot API
- [ ] 993. Zoho CRM API
- [ ] 994. Microsoft Dynamics CRM API
- [ ] 995. SugarCRM API
- [ ] 996. SuiteCRM API
- [ ] 997. Insightly API
- [ ] 998. Agile CRM API
- [ ] 999. Bitrix24 API
- [ ] 1000. Pipedrive API











