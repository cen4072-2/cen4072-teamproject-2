package test.java.cen4072;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import test.java.cen4072.models.*;

@RunWith(JUnit4.class)
public class Tests {

    private static WebDriver driver;

    public String comments(){
    String longComment = "long";/*"Provided by USConstitution.net\n" +
            "------------------------------\n" +
            "\n" +
            "[Note: Repealed text is not noted in this version.  Spelling errors have been\n" +
            "corrected in this version.  For an uncorrected, annotated version of the\n" +
            "Constitution, visit http://www.usconstitution.net/const.html ]\n" +
            "\n" +
            "We the People of the United States, in Order to form a more perfect Union,\n" +
            "establish Justice, insure domestic Tranquility, provide for the common\n" +
            "defence, promote the general Welfare, and secure the Blessings of Liberty to\n" +
            "ourselves and our Posterity, do ordain and establish this Constitution for the\n" +
            "United States of America.\n" +
            "\n" +
            "Article 1.\n" +
            "\n" +
            "Section 1\n" +
            "All legislative Powers herein granted shall be vested in a Congress of the\n" +
            "United States, which shall consist of a Senate and House of Representatives.\n" +
            "\n" +
            "Section 2\n" +
            "The House of Representatives shall be composed of Members chosen every second\n" +
            "Year by the People of the several States, and the Electors in each State shall\n" +
            "have the Qualifications requisite for Electors of the most numerous Branch of\n" +
            "the State Legislature.\n" +
            "\n" +
            "No Person shall be a Representative who shall not have attained to the Age of\n" +
            "twenty five Years, and been seven Years a Citizen of the United States, and who\n" +
            "shall not, when elected, be an Inhabitant of that State in which he shall be\n" +
            "chosen.\n" +
            "\n" +
            "Representatives and direct Taxes shall be apportioned among the several States\n" +
            "which may be included within this Union, according to their respective Numbers,\n" +
            "which shall be determined by adding to the whole Number of free Persons,\n" +
            "including those bound to Service for a Term of Years, and excluding Indians not\n" +
            "taxed, three fifths of all other Persons.\n" +
            "\n" +
            "The actual Enumeration shall be made within three Years after the first Meeting\n" +
            "of the Congress of the United States, and within every subsequent Term of ten\n" +
            "Years, in such Manner as they shall by Law direct. The Number of\n" +
            "Representatives shall not exceed one for every thirty Thousand, but each State\n" +
            "shall have at Least one Representative; and until such enumeration shall be\n" +
            "made, the State of New Hampshire shall be entitled to choose three,\n" +
            "Massachusetts eight, Rhode Island and Providence Plantations one, Connecticut\n" +
            "five, New York six, New Jersey four, Pennsylvania eight, Delaware one, Maryland\n" +
            "six, Virginia ten, North Carolina five, South Carolina five and Georgia three.\n" +
            "\n" +
            "When vacancies happen in the Representation from any State, the Executive\n" +
            "Authority thereof shall issue Writs of Election to fill such Vacancies.\n" +
            "\n" +
            "The House of Representatives shall choose their Speaker and other Officers; and\n" +
            "shall have the sole Power of Impeachment.\n" +
            "\n" +
            "Section 3\n" +
            "The Senate of the United States shall be composed of two Senators from each\n" +
            "State, chosen by the Legislature thereof, for six Years; and each Senator shall\n" +
            "have one Vote.\n" +
            "\n" +
            "Immediately after they shall be assembled in Consequence of the first Election,\n" +
            "they shall be divided as equally as may be into three Classes. The Seats of the\n" +
            "Senators of the first Class shall be vacated at the Expiration of the second\n" +
            "Year, of the second Class at the Expiration of the fourth Year, and of the\n" +
            "third Class at the Expiration of the sixth Year, so that one third may be\n" +
            "chosen every second Year; and if Vacancies happen by Resignation, or otherwise,\n" +
            "during the Recess of the Legislature of any State, the Executive thereof may\n" +
            "make temporary Appointments until the next Meeting of the Legislature, which\n" +
            "shall then fill such Vacancies.\n" +
            "\n" +
            "No person shall be a Senator who shall not have attained to the Age of thirty\n" +
            "Years, and been nine Years a Citizen of the United States, and who shall not,\n" +
            "when elected, be an Inhabitant of that State for which he shall be chosen.\n" +
            "\n" +
            "The Vice President of the United States shall be President of the Senate, but\n" +
            "shall have no Vote, unless they be equally divided.\n" +
            "\n" +
            "The Senate shall choose their other Officers, and also a President pro tempore,\n" +
            "in the absence of the Vice President, or when he shall exercise the Office of\n" +
            "President of the United States.\n" +
            "\n" +
            "The Senate shall have the sole Power to try all Impeachments. When sitting for\n" +
            "that Purpose, they shall be on Oath or Affirmation. When the President of the\n" +
            "United States is tried, the Chief Justice shall preside: And no Person shall be\n" +
            "convicted without the Concurrence of two thirds of the Members present.\n" +
            "\n" +
            "Judgment in Cases of Impeachment shall not extend further than to removal from\n" +
            "Office, and disqualification to hold and enjoy any Office of honor, Trust or\n" +
            "Profit under the United States: but the Party convicted shall nevertheless be\n" +
            "liable and subject to Indictment, Trial, Judgment and Punishment, according to\n" +
            "Law.\n" +
            "\n" +
            "Section 4\n" +
            "The Times, Places and Manner of holding Elections for Senators and\n" +
            "Representatives, shall be prescribed in each State by the Legislature thereof;\n" +
            "but the Congress may at any time by Law make or alter such Regulations, except\n" +
            "as to the Place of Choosing Senators.\n" +
            "\n" +
            "The Congress shall assemble at least once in every Year, and such Meeting shall\n" +
            "be on the first Monday in December, unless they shall by Law appoint a\n" +
            "different Day.\n" +
            "\n" +
            "Section 5\n" +
            "Each House shall be the Judge of the Elections, Returns and Qualifications of\n" +
            "its own Members, and a Majority of each shall constitute a Quorum to do\n" +
            "Business; but a smaller number may adjourn from day to day, and may be\n" +
            "authorized to compel the Attendance of absent Members, in such Manner, and\n" +
            "under such Penalties as each House may provide.\n" +
            "\n" +
            "Each House may determine the Rules of its Proceedings, punish its Members for\n" +
            "disorderly Behavior, and, with the Concurrence of two-thirds, expel a Member.\n" +
            "\n" +
            "Each House shall keep a Journal of its Proceedings, and from time to time\n" +
            "publish the same, excepting such Parts as may in their Judgment require\n" +
            "Secrecy; and the Yeas and Nays of the Members of either House on any question\n" +
            "shall, at the Desire of one fifth of those Present, be entered on the Journal.\n" +
            "\n" +
            "Neither House, during the Session of Congress, shall, without the Consent of\n" +
            "the other, adjourn for more than three days, nor to any other Place than that\n" +
            "in which the two Houses shall be sitting.\n" +
            "\n" +
            "Section 6\n" +
            "The Senators and Representatives shall receive a Compensation for their\n" +
            "Services, to be ascertained by Law, and paid out of the Treasury of the United\n" +
            "States. They shall in all Cases, except Treason, Felony and Breach of the\n" +
            "Peace, be privileged from Arrest during their Attendance at the Session of\n" +
            "their respective Houses, and in going to and returning from the same; and for\n" +
            "any Speech or Debate in either House, they shall not be questioned in any other\n" +
            "Place.\n" +
            "\n" +
            "No Senator or Representative shall, during the Time for which he was elected,\n" +
            "be appointed to any civil Office under the Authority of the United States which\n" +
            "shall have been created, or the Emoluments whereof shall have been increased\n" +
            "during such time; and no Person holding any Office under the United States,\n" +
            "shall be a Member of either House during his Continuance in Office.\n" +
            "\n" +
            "\n" +
            "Section 7\n" +
            "All bills for raising Revenue shall originate in the House of Representatives;\n" +
            "but the Senate may propose or concur with Amendments as on other Bills.\n" +
            "\n" +
            "Every Bill which shall have passed the House of Representatives and the Senate,\n" +
            "shall, before it become a Law, be presented to the President of the United\n" +
            "States; If he approve he shall sign it, but if not he shall return it, with his\n" +
            "Objections to that House in which it shall have originated, who shall enter the\n" +
            "Objections at large on their Journal, and proceed to reconsider it. If after\n" +
            "such Reconsideration two thirds of that House shall agree to pass the Bill, it\n" +
            "shall be sent, together with the Objections, to the other House, by which it\n" +
            "shall likewise be reconsidered, and if approved by two thirds of that House, it\n" +
            "shall become a Law. But in all such Cases the Votes of both Houses shall be\n" +
            "determined by Yeas and Nays, and the Names of the Persons voting for and\n" +
            "against the Bill shall be entered on the Journal of each House respectively. If\n" +
            "any Bill shall not be returned by the President within ten Days (Sundays\n" +
            "excepted) after it shall have been presented to him, the Same shall be a Law,\n" +
            "in like Manner as if he had signed it, unless the Congress by their Adjournment\n" +
            "prevent its Return, in which Case it shall not be a Law.\n" +
            "\n" +
            "Every Order, Resolution, or Vote to which the Concurrence of the Senate and\n" +
            "House of Representatives may be necessary (except on a question of Adjournment)\n" +
            "shall be presented to the President of the United States; and before the Same\n" +
            "shall take Effect, shall be approved by him, or being disapproved by him, shall\n" +
            "be repassed by two thirds of the Senate and House of Representatives, according\n" +
            "to the Rules and Limitations prescribed in the Case of a Bill.\n" +
            "\n" +
            "\n" +
            "Section 8\n" +
            "The Congress shall have Power To lay and collect Taxes, Duties, Imposts and\n" +
            "Excises, to pay the Debts and provide for the common Defence and general\n" +
            "Welfare of the United States; but all Duties, Imposts and Excises shall be\n" +
            "uniform throughout the United States;\n" +
            "\n" +
            "To borrow money on the credit of the United States;\n" +
            "\n" +
            "To regulate Commerce with foreign Nations, and among the several States, and\n" +
            "with the Indian Tribes;\n" +
            "\n" +
            "To establish an uniform Rule of Naturalization, and uniform Laws on the subject\n" +
            "of Bankruptcies throughout the United States;\n" +
            "\n" +
            "To coin Money, regulate the Value thereof, and of foreign Coin, and fix the\n" +
            "Standard of Weights and Measures;\n" +
            "\n" +
            "To provide for the Punishment of counterfeiting the Securities and current Coin\n" +
            "of the United States;\n" +
            "\n" +
            "To establish Post Offices and Post Roads;\n" +
            "\n" +
            "To promote the Progress of Science and useful Arts, by securing for limited\n" +
            "Times to Authors and Inventors the exclusive Right to their respective Writings\n" +
            "and Discoveries;\n" +
            "\n" +
            "To constitute Tribunals inferior to the supreme Court;\n" +
            "\n" +
            "To define and punish Piracies and Felonies committed on the high Seas, and\n" +
            "Offenses against the Law of Nations;\n" +
            "\n" +
            "To declare War, grant Letters of Marque and Reprisal, and make Rules concerning\n" +
            "Captures on Land and Water;\n" +
            "\n" +
            "To raise and support Armies, but no Appropriation of Money to that Use shall be\n" +
            "for a longer Term than two Years;\n" +
            "\n" +
            "To provide and maintain a Navy;\n" +
            "\n" +
            "To make Rules for the Government and Regulation of the land and naval Forces;\n" +
            "\n" +
            "To provide for calling forth the Militia to execute the Laws of the Union,\n" +
            "suppress Insurrections and repel Invasions;\n" +
            "\n" +
            "To provide for organizing, arming, and disciplining, the Militia, and for\n" +
            "governing such Part of them as may be employed in the Service of the United\n" +
            "States, reserving to the States respectively, the Appointment of the Officers,\n" +
            "and the Authority of training the Militia according to the discipline\n" +
            "prescribed by Congress;\n" +
            "\n" +
            "To exercise exclusive Legislation in all Cases whatsoever, over such District\n" +
            "(not exceeding ten Miles square) as may, by Cession of particular States, and\n" +
            "the acceptance of Congress, become the Seat of the Government of the United\n" +
            "States, and to exercise like Authority over all Places purchased by the Consent\n" +
            "of the Legislature of the State in which the Same shall be, for the Erection of\n" +
            "Forts, Magazines, Arsenals, dock-Yards, and other needful Buildings; And\n" +
            "\n" +
            "To make all Laws which shall be necessary and proper for carrying into\n" +
            "Execution the foregoing Powers, and all other Powers vested by this\n" +
            "Constitution in the Government of the United States, or in any Department or\n" +
            "Officer thereof.\n" +
            "\n" +
            "Section 9\n" +
            "The Migration or Importation of such Persons as any of the States now existing\n" +
            "shall think proper to admit, shall not be prohibited by the Congress prior to\n" +
            "the Year one thousand eight hundred and eight, but a tax or duty may be imposed\n" +
            "on such Importation, not exceeding ten dollars for each Person.\n" +
            "\n" +
            "The privilege of the Writ of Habeas Corpus shall not be suspended, unless when\n" +
            "in Cases of Rebellion or Invasion the public Safety may require it.\n" +
            "\n" +
            "No Bill of Attainder or ex post facto Law shall be passed.\n" +
            "\n" +
            "No capitation, or other direct, Tax shall be laid, unless in Proportion to the\n" +
            "Census or Enumeration herein before directed to be taken.\n" +
            "\n" +
            "No Tax or Duty shall be laid on Articles exported from any State.\n" +
            "\n" +
            "No Preference shall be given by any Regulation of Commerce or Revenue to the\n" +
            "Ports of one State over those of another: nor shall Vessels bound to, or from,\n" +
            "one State, be obliged to enter, clear, or pay Duties in another.\n" +
            "\n" +
            "No Money shall be drawn from the Treasury, but in Consequence of Appropriations\n" +
            "made by Law; and a regular Statement and Account of the Receipts and\n" +
            "Expenditures of all public Money shall be published from time to time.\n" +
            "\n" +
            "No Title of Nobility shall be granted by the United States: And no Person\n" +
            "holding any Office of Profit or Trust under them, shall, without the Consent of\n" +
            "the Congress, accept of any present, Emolument, Office, or Title, of any kind\n" +
            "whatever, from any King, Prince or foreign State.\n" +
            "\n" +
            "Section 10\n" +
            "No State shall enter into any Treaty, Alliance, or Confederation; grant Letters\n" +
            "of Marque and Reprisal; coin Money; emit Bills of Credit; make any Thing but\n" +
            "gold and silver Coin a Tender in Payment of Debts; pass any Bill of Attainder,\n" +
            "ex post facto Law, or Law impairing the Obligation of Contracts, or grant any\n" +
            "Title of Nobility.\n" +
            "\n" +
            "No State shall, without the Consent of the Congress, lay any Imposts or Duties\n" +
            "on Imports or Exports, except what may be absolutely necessary for executing\n" +
            "its inspection Laws: and the net Produce of all Duties and Imposts, laid by\n" +
            "any State on Imports or Exports, shall be for the Use of the Treasury of the\n" +
            "United States; and all such Laws shall be subject to the Revision and Control\n" +
            "of the Congress.\n" +
            "\n" +
            "No State shall, without the Consent of Congress, lay any duty of Tonnage, keep\n" +
            "Troops, or Ships of War in time of Peace, enter into any Agreement or Compact\n" +
            "with another State, or with a foreign Power, or engage in War, unless actually\n" +
            "invaded, or in such imminent Danger as will not admit of delay.\n" +
            "\n" +
            "Article 2.\n" +
            "\n" +
            "Section 1\n" +
            "The executive Power shall be vested in a President of the United States of\n" +
            "America. He shall hold his Office during the Term of four Years, and, together\n" +
            "with the Vice-President chosen for the same Term, be elected, as follows:\n" +
            "\n" +
            "Each State shall appoint, in such Manner as the Legislature thereof may direct,\n" +
            "a Number of Electors, equal to the whole Number of Senators and Representatives\n" +
            "to which the State may be entitled in the Congress: but no Senator or\n" +
            "Representative, or Person holding an Office of Trust or Profit under the United\n" +
            "States, shall be appointed an Elector.\n" +
            "\n" +
            "The Electors shall meet in their respective States, and vote by Ballot for two\n" +
            "persons, of whom one at least shall not lie an Inhabitant of the same State\n" +
            "with themselves. And they shall make a List of all the Persons voted for, and\n" +
            "of the Number of Votes for each; which List they shall sign and certify, and\n" +
            "transmit sealed to the Seat of the Government of the United States, directed to\n" +
            "the President of the Senate. The President of the Senate shall, in the Presence\n" +
            "of the Senate and House of Representatives, open all the Certificates, and the\n" +
            "Votes shall then be counted. The Person having the greatest Number of Votes\n" +
            "shall be the President, if such Number be a Majority of the whole Number of\n" +
            "Electors appointed; and if there be more than one who have such Majority, and\n" +
            "have an equal Number of Votes, then the House of Representatives shall\n" +
            "immediately choose by Ballot one of them for President; and if no Person have a\n" +
            "Majority, then from the five highest on the List the said House shall in like\n" +
            "Manner choose the President. But in choosing the President, the Votes shall be\n" +
            "taken by States, the Representation from each State having one Vote; a quorum\n" +
            "for this Purpose shall consist of a Member or Members from two-thirds of the\n" +
            "States, and a Majority of all the States shall be necessary to a Choice. In\n" +
            "every Case, after the Choice of the President, the Person having the greatest\n" +
            "Number of Votes of the Electors shall be the Vice President. But if there\n" +
            "should remain two or more who have equal Votes, the Senate shall choose from\n" +
            "them by Ballot the Vice-President.\n" +
            "\n" +
            "The Congress may determine the Time of choosing the Electors, and the Day on\n" +
            "which they shall give their Votes; which Day shall be the same throughout the\n" +
            "United States.\n" +
            "\n" +
            "No person except a natural born Citizen, or a Citizen of the United States, at\n" +
            "the time of the Adoption of this Constitution, shall be eligible to the Office\n" +
            "of President; neither shall any Person be eligible to that Office who shall not\n" +
            "have attained to the Age of thirty-five Years, and been fourteen Years a\n" +
            "Resident within the United States.\n" +
            "\n" +
            "In Case of the Removal of the President from Office, or of his Death,\n" +
            "Resignation, or Inability to discharge the Powers and Duties of the said\n" +
            "Office, the same shall devolve on the Vice President, and the Congress may by\n" +
            "Law provide for the Case of Removal, Death, Resignation or Inability, both of\n" +
            "the President and Vice President, declaring what Officer shall then act as\n" +
            "President, and such Officer shall act accordingly, until the Disability be\n" +
            "removed, or a President shall be elected.\n" +
            "\n" +
            "The President shall, at stated Times, receive for his Services, a Compensation,\n" +
            "which shall neither be increased nor diminished during the Period for which he\n" +
            "shall have been elected, and he shall not receive within that Period any other\n" +
            "Emolument from the United States, or any of them.\n" +
            "\n" +
            "Before he enter on the Execution of his Office, he shall take the following\n" +
            "Oath or Affirmation:\n" +
            "\n" +
            "\"I do solemnly swear (or affirm) that I will faithfully execute the Office of\n" +
            "President of the United States, and will to the best of my Ability, preserve,\n" +
            "protect and defend the Constitution of the United States.\"\n" +
            "\n" +
            "Section 2\n" +
            "The President shall be Commander in Chief of the Army and Navy of the United\n" +
            "States, and of the Militia of the several States, when called into the actual\n" +
            "Service of the United States; he may require the Opinion, in writing, of the\n" +
            "principal Officer in each of the executive Departments, upon any subject\n" +
            "relating to the Duties of their respective Offices, and he shall have Power to\n" +
            "Grant Reprieves and Pardons for Offenses against the United States, except in\n" +
            "Cases of Impeachment.\n" +
            "\n" +
            "He shall have Power, by and with the Advice and Consent of the Senate, to make\n" +
            "Treaties, provided two thirds of the Senators present concur; and he shall\n" +
            "nominate, and by and with the Advice and Consent of the Senate, shall appoint\n" +
            "Ambassadors, other public Ministers and Consuls, Judges of the supreme Court,\n" +
            "and all other Officers of the United States, whose Appointments are not herein\n" +
            "otherwise provided for, and which shall be established by Law: but the Congress\n" +
            "may by Law vest the Appointment of such inferior Officers, as they think\n" +
            "proper, in the President alone, in the Courts of Law, or in the Heads of\n" +
            "Departments.\n" +
            "\n" +
            "The President shall have Power to fill up all Vacancies that may happen during\n" +
            "the Recess of the Senate, by granting Commissions which shall expire at the End\n" +
            "of their next Session.\n" +
            "\n" +
            "Section 3\n" +
            "He shall from time to time give to the Congress Information of the State of the\n" +
            "Union, and recommend to their Consideration such Measures as he shall judge\n" +
            "necessary and expedient; he may, on extraordinary Occasions, convene both\n" +
            "Houses, or either of them, and in Case of Disagreement between them, with\n" +
            "Respect to the Time of Adjournment, he may adjourn them to such Time as he\n" +
            "shall think proper; he shall receive Ambassadors and other public Ministers; he\n" +
            "shall take Care that the Laws be faithfully executed, and shall Commission all\n" +
            "the Officers of the United States.\n" +
            "\n" +
            "Section 4\n" +
            "The President, Vice President and all civil Officers of the United States,\n" +
            "shall be removed from Office on Impeachment for, and Conviction of, Treason,\n" +
            "Bribery, or other high Crimes and Misdemeanors.\n" +
            "\n" +
            "Article 3.\n" +
            "\n" +
            "Section 1\n" +
            "The judicial Power of the United States, shall be vested in one supreme Court,\n" +
            "and in such inferior Courts as the Congress may from time to time ordain and\n" +
            "establish. The Judges, both of the supreme and inferior Courts, shall hold\n" +
            "their Offices during good Behavior, and shall, at stated Times, receive for\n" +
            "their Services a Compensation which shall not be diminished during their\n" +
            "Continuance in Office.\n" +
            "\n" +
            "Section 2\n" +
            "The judicial Power shall extend to all Cases, in Law and Equity, arising under\n" +
            "this Constitution, the Laws of the United States, and Treaties made, or which\n" +
            "shall be made, under their Authority; to all Cases affecting Ambassadors, other\n" +
            "public Ministers and Consuls; to all Cases of admiralty and maritime\n" +
            "Jurisdiction; to Controversies to which the United States shall be a Party; to\n" +
            "Controversies between two or more States; between a State and Citizens of\n" +
            "another State; between Citizens of different States; between Citizens of the\n" +
            "same State claiming Lands under Grants of different States, and between a\n" +
            "State, or the Citizens thereof, and foreign States, Citizens or Subjects.\n" +
            "\n" +
            "In all Cases affecting Ambassadors, other public Ministers and Consuls, and\n" +
            "those in which a State shall be Party, the supreme Court shall have original\n" +
            "Jurisdiction. In all the other Cases before mentioned, the supreme Court shall\n" +
            "have appellate Jurisdiction, both as to Law and Fact, with such Exceptions, and\n" +
            "under such Regulations as the Congress shall make.\n" +
            "\n" +
            "The Trial of all Crimes, except in Cases of Impeachment, shall be by Jury; and\n" +
            "such Trial shall be held in the State where the said Crimes shall have been\n" +
            "committed; but when not committed within any State, the Trial shall be at such\n" +
            "Place or Places as the Congress may by Law have directed.\n" +
            "\n" +
            "Section 3\n" +
            "Treason against the United States, shall consist only in levying War against\n" +
            "them, or in adhering to their Enemies, giving them Aid and Comfort. No Person\n" +
            "shall be convicted of Treason unless on the Testimony of two Witnesses to the\n" +
            "same overt Act, or on Confession in open Court.\n" +
            "\n" +
            "The Congress shall have power to declare the Punishment of Treason, but no\n" +
            "Attainder of Treason shall work Corruption of Blood, or Forfeiture except\n" +
            "during the Life of the Person attainted.\n" +
            "\n" +
            "Article 4.\n" +
            "\n" +
            "Section 1\n" +
            "Full Faith and Credit shall be given in each State to the public Acts, Records,\n" +
            "and judicial Proceedings of every other State. And the Congress may by general\n" +
            "Laws prescribe the Manner in which such Acts, Records and Proceedings shall be\n" +
            "proved, and the Effect thereof.\n" +
            "\n" +
            "Section 2\n" +
            "The Citizens of each State shall be entitled to all Privileges and Immunities\n" +
            "of Citizens in the several States.\n" +
            "\n" +
            "A Person charged in any State with Treason, Felony, or other Crime, who shall\n" +
            "flee from Justice, and be found in another State, shall on demand of the\n" +
            "executive Authority of the State from which he fled, be delivered up, to be\n" +
            "removed to the State having Jurisdiction of the Crime.\n" +
            "\n" +
            "No Person held to Service or Labour in one State, under the Laws thereof,\n" +
            "escaping into another, shall, in Consequence of any Law or Regulation therein,\n" +
            "be discharged from such Service or Labour, But shall be delivered up on Claim\n" +
            "of the Party to whom such Service or Labour may be due.\n" +
            "\n" +
            "Section 3\n" +
            "New States may be admitted by the Congress into this Union; but no new States\n" +
            "shall be formed or erected within the Jurisdiction of any other State; nor any\n" +
            "State be formed by the Junction of two or more States, or parts of States,\n" +
            "without the Consent of the Legislatures of the States concerned as well as of\n" +
            "the Congress.\n" +
            "\n" +
            "The Congress shall have Power to dispose of and make all needful Rules and\n" +
            "Regulations respecting the Territory or other Property belonging to the United\n" +
            "States; and nothing in this Constitution shall be so construed as to Prejudice\n" +
            "any Claims of the United States, or of any particular State.\n" +
            "\n" +
            "Section 4\n" +
            "The United States shall guarantee to every State in this Union a Republican\n" +
            "Form of Government, and shall protect each of them against Invasion; and on\n" +
            "Application of the Legislature, or of the Executive (when the Legislature\n" +
            "cannot be convened) against domestic Violence.\n" +
            "\n" +
            "Article 5.\n" +
            "\n" +
            "The Congress, whenever two thirds of both Houses shall deem it necessary, shall\n" +
            "propose Amendments to this Constitution, or, on the Application of the\n" +
            "Legislatures of two thirds of the several States, shall call a Convention for\n" +
            "proposing Amendments, which, in either Case, shall be valid to all Intents and\n" +
            "Purposes, as part of this Constitution, when ratified by the Legislatures of\n" +
            "three fourths of the several States, or by Conventions in three fourths\n" +
            "thereof, as the one or the other Mode of Ratification may be proposed by the\n" +
            "Congress; Provided that no Amendment which may be made prior to the Year One\n" +
            "thousand eight hundred and eight shall in any Manner affect the first and\n" +
            "fourth Clauses in the Ninth Section of the first Article; and that no State,\n" +
            "without its Consent, shall be deprived of its equal Suffrage in the Senate.\n" +
            "\n" +
            "Article 6.\n" +
            "\n" +
            "All Debts contracted and Engagements entered into, before the Adoption of this\n" +
            "Constitution, shall be as valid against the United States under this\n" +
            "Constitution, as under the Confederation.\n" +
            "\n" +
            "This Constitution, and the Laws of the United States which shall be made in\n" +
            "Pursuance thereof; and all Treaties made, or which shall be made, under the\n" +
            "Authority of the United States, shall be the supreme Law of the Land; and the\n" +
            "Judges in every State shall be bound thereby, any Thing in the Constitution or\n" +
            "Laws of any State to the Contrary notwithstanding.\n" +
            "\n" +
            "The Senators and Representatives before mentioned, and the Members of the\n" +
            "several State Legislatures, and all executive and judicial Officers, both of\n" +
            "the United States and of the several States, shall be bound by Oath or\n" +
            "Affirmation, to support this Constitution; but no religious Test shall ever be\n" +
            "required as a Qualification to any Office or public Trust under the United\n" +
            "States.\n" +
            "\n" +
            "Article 7.\n" +
            "\n" +
            "The Ratification of the Conventions of nine States, shall be sufficient for the\n" +
            "Establishment of this Constitution between the States so ratifying the Same.\n" +
            "\n" +
            "Done in Convention by the Unanimous Consent of the States present the\n" +
            "Seventeenth Day of September in the Year of our Lord one thousand seven hundred\n" +
            "and Eighty seven and of the Independence of the United States of America the\n" +
            "Twelfth. In Witness whereof We have hereunto subscribed our Names.\n" +
            "\n" +
            "George Washington - President and deputy from Virginia\n" +
            "\n" +
            "New Hampshire - John Langdon, Nicholas Gilman\n" +
            "\n" +
            "Massachusetts - Nathaniel Gorham, Rufus King\n" +
            "\n" +
            "Connecticut - William Samuel Johnson, Roger Sherman\n" +
            "\n" +
            "New York - Alexander Hamilton\n" +
            "\n" +
            "New Jersey - William Livingston, David Brearley, William Paterson, Jonathan\n" +
            "Dayton\n" +
            "\n" +
            "Pennsylvania - Benjamin Franklin, Thomas Mifflin, Robert Morris, George Clymer,\n" +
            "Thomas Fitzsimons, Jared Ingersoll, James Wilson, Gouvernour Morris\n" +
            "\n" +
            "Delaware - George Read, Gunning Bedford Jr., John Dickinson, Richard Bassett,\n" +
            "Jacob Broom\n" +
            "\n" +
            "Maryland - James McHenry, Daniel of St Thomas Jenifer, Daniel Carroll\n" +
            "\n" +
            "Virginia - John Blair, James Madison Jr.\n" +
            "\n" +
            "North Carolina - William Blount, Richard Dobbs Spaight, Hugh Williamson\n" +
            "\n" +
            "South Carolina - John Rutledge, Charles Cotesworth Pinckney, Charles Pinckney,\n" +
            "Pierce Butler\n" +
            "\n" +
            "Georgia - William Few, Abraham Baldwin\n" +
            "\n" +
            "Attest: William Jackson, Secretary\n" +
            "\n" +
            "\n" +
            "Amendment 1\n" +
            "Congress shall make no law respecting an establishment of religion, or\n" +
            "prohibiting the free exercise thereof; or abridging the freedom of speech, or\n" +
            "of the press; or the right of the people peaceably to assemble, and to petition\n" +
            "the Government for a redress of grievances.\n" +
            "\n" +
            "Amendment 2\n" +
            "A well regulated Militia, being necessary to the security of a free State, the\n" +
            "right of the people to keep and bear Arms, shall not be infringed.\n" +
            "\n" +
            "Amendment 3\n" +
            "No Soldier shall, in time of peace be quartered in any house, without the\n" +
            "consent of the Owner, nor in time of war, but in a manner to be prescribed by\n" +
            "law.\n" +
            "\n" +
            "Amendment 4\n" +
            "The right of the people to be secure in their persons, houses, papers, and\n" +
            "effects, against unreasonable searches and seizures, shall not be violated, and\n" +
            "no Warrants shall issue, but upon probable cause, supported by Oath or\n" +
            "affirmation, and particularly describing the place to be searched, and the\n" +
            "persons or things to be seized.\n" +
            "\n" +
            "Amendment 5\n" +
            "No person shall be held to answer for a capital, or otherwise infamous crime,\n" +
            "unless on a presentment or indictment of a Grand Jury, except in cases arising\n" +
            "in the land or naval forces, or in the Militia, when in actual service in time\n" +
            "of War or public danger; nor shall any person be subject for the same offense\n" +
            "to be twice put in jeopardy of life or limb; nor shall be compelled in any\n" +
            "criminal case to be a witness against himself, nor be deprived of life,\n" +
            "liberty, or property, without due process of law; nor shall private property be\n" +
            "taken for public use, without just compensation.\n" +
            "\n" +
            "Amendment 6\n" +
            "In all criminal prosecutions, the accused shall enjoy the right to a speedy and\n" +
            "public trial, by an impartial jury of the State and district wherein the crime\n" +
            "shall have been committed, which district shall have been previously\n" +
            "ascertained by law, and to be informed of the nature and cause of the\n" +
            "accusation; to be confronted with the witnesses against him; to have compulsory\n" +
            "process for obtaining witnesses in his favor, and to have the Assistance of\n" +
            "Counsel for his defence.\n" +
            "\n" +
            "Amendment 7\n" +
            "In Suits at common law, where the value in controversy shall exceed twenty\n" +
            "dollars, the right of trial by jury shall be preserved, and no fact tried by a\n" +
            "jury, shall be otherwise re-examined in any Court of the United States, than\n" +
            "according to the rules of the common law.\n" +
            "\n" +
            "Amendment 8\n" +
            "Excessive bail shall not be required, nor excessive fines imposed, nor cruel\n" +
            "and unusual punishments inflicted.\n" +
            "\n" +
            "Amendment 9\n" +
            "The enumeration in the Constitution, of certain rights, shall not be construed\n" +
            "to deny or disparage others retained by the people.\n" +
            "\n" +
            "Amendment 10\n" +
            "The powers not delegated to the United States by the Constitution, nor\n" +
            "prohibited by it to the States, are reserved to the States respectively, or to\n" +
            "the people.\n" +
            "\n" +
            "Amendment 11\n" +
            "The Judicial power of the United States shall not be construed to extend to any\n" +
            "suit in law or equity, commenced or prosecuted against one of the United States\n" +
            "by Citizens of another State, or by Citizens or Subjects of any Foreign State.\n" +
            "\n" +
            "Amendment 12\n" +
            "The Electors shall meet in their respective states, and vote by ballot for\n" +
            "President and Vice-President, one of whom, at least, shall not be an inhabitant\n" +
            "of the same state with themselves; they shall name in their ballots the person\n" +
            "voted for as President, and in distinct ballots the person voted for as\n" +
            "Vice-President, and they shall make distinct lists of all persons voted for as\n" +
            "President, and of all persons voted for as Vice-President and of the number of\n" +
            "votes for each, which lists they shall sign and certify, and transmit sealed to\n" +
            "the seat of the government of the United States, directed to the President of\n" +
            "the Senate;\n" +
            "\n" +
            "The President of the Senate shall, in the presence of the Senate and House of\n" +
            "Representatives, open all the certificates and the votes shall then be counted;\n" +
            "\n" +
            "The person having the greatest Number of votes for President, shall be the\n" +
            "President, if such number be a majority of the whole number of Electors\n" +
            "appointed; and if no person have such majority, then from the persons having\n" +
            "the highest numbers not exceeding three on the list of those voted for as\n" +
            "President, the House of Representatives shall choose immediately, by ballot,\n" +
            "the President. But in choosing the President, the votes shall be taken by\n" +
            "states, the representation from each state having one vote; a quorum for this\n" +
            "purpose shall consist of a member or members from two-thirds of the states, and\n" +
            "a majority of all the states shall be necessary to a choice. And if the House\n" +
            "of Representatives shall not choose a President whenever the right of choice\n" +
            "shall devolve upon them, before the fourth day of March next following, then\n" +
            "the Vice-President shall act as President, as in the case of the death or other\n" +
            "constitutional disability of the President.\n" +
            "\n" +
            "The person having the greatest number of votes as Vice-President, shall be the\n" +
            "Vice-President, if such number be a majority of the whole number of Electors\n" +
            "appointed, and if no person have a majority, then from the two highest numbers\n" +
            "on the list, the Senate shall choose the Vice-President; a quorum for the\n" +
            "purpose shall consist of two-thirds of the whole number of Senators, and a\n" +
            "majority of the whole number shall be necessary to a choice. But no person\n" +
            "constitutionally ineligible to the office of President shall be eligible to\n" +
            "that of Vice-President of the United States.\n" +
            "\n" +
            "Amendment 13\n" +
            "1. Neither slavery nor involuntary servitude, except as a punishment for crime\n" +
            "whereof the party shall have been duly convicted, shall exist within the United\n" +
            "States, or any place subject to their jurisdiction.\n" +
            "\n" +
            "2. Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 14\n" +
            "1. All persons born or naturalized in the United States, and subject to the\n" +
            "jurisdiction thereof, are citizens of the United States and of the State\n" +
            "wherein they reside. No State shall make or enforce any law which shall abridge\n" +
            "the privileges or immunities of citizens of the United States; nor shall any\n" +
            "State deprive any person of life, liberty, or property, without due process of\n" +
            "law; nor deny to any person within its jurisdiction the equal protection of the\n" +
            "laws.\n" +
            "\n" +
            "2. Representatives shall be apportioned among the several States according to\n" +
            "their respective numbers, counting the whole number of persons in each State,\n" +
            "excluding Indians not taxed. But when the right to vote at any election for the\n" +
            "choice of electors for President and Vice-President of the United States,\n" +
            "Representatives in Congress, the Executive and Judicial officers of a State, or\n" +
            "the members of the Legislature thereof, is denied to any of the male\n" +
            "inhabitants of such State, being twenty-one years of age, and citizens of the\n" +
            "United States, or in any way abridged, except for participation in rebellion,\n" +
            "or other crime, the basis of representation therein shall be reduced in the\n" +
            "proportion which the number of such male citizens shall bear to the whole\n" +
            "number of male citizens twenty-one years of age in such State.\n" +
            "\n" +
            "3. No person shall be a Senator or Representative in Congress, or elector of\n" +
            "President and Vice-President, or hold any office, civil or military, under the\n" +
            "United States, or under any State, who, having previously taken an oath, as a\n" +
            "member of Congress, or as an officer of the United States, or as a member of\n" +
            "any State legislature, or as an executive or judicial officer of any State, to\n" +
            "support the Constitution of the United States, shall have engaged in\n" +
            "insurrection or rebellion against the same, or given aid or comfort to the\n" +
            "enemies thereof. But Congress may by a vote of two-thirds of each House, remove\n" +
            "such disability.\n" +
            "\n" +
            "4. The validity of the public debt of the United States, authorized by law,\n" +
            "including debts incurred for payment of pensions and bounties for services in\n" +
            "suppressing insurrection or rebellion, shall not be questioned. But neither the\n" +
            "United States nor any State shall assume or pay any debt or obligation incurred\n" +
            "in aid of insurrection or rebellion against the United States, or any claim for\n" +
            "the loss or emancipation of any slave; but all such debts, obligations and\n" +
            "claims shall be held illegal and void.\n" +
            "\n" +
            "5. The Congress shall have power to enforce, by appropriate legislation, the\n" +
            "provisions of this article.\n" +
            "\n" +
            "Amendment 15\n" +
            "1. The right of citizens of the United States to vote shall not be denied or\n" +
            "abridged by the United States or by any State on account of race, color, or\n" +
            "previous condition of servitude.\n" +
            "\n" +
            "2. The Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 16\n" +
            "The Congress shall have power to lay and collect taxes on incomes, from\n" +
            "whatever source derived, without apportionment among the several States, and\n" +
            "without regard to any census or enumeration.\n" +
            "\n" +
            "Amendment 17\n" +
            "The Senate of the United States shall be composed of two Senators from each\n" +
            "State, elected by the people thereof, for six years; and each Senator shall\n" +
            "have one vote. The electors in each State shall have the qualifications\n" +
            "requisite for electors of the most numerous branch of the State legislatures.\n" +
            "\n" +
            "When vacancies happen in the representation of any State in the Senate, the\n" +
            "executive authority of such State shall issue writs of election to fill such\n" +
            "vacancies: Provided, That the legislature of any State may empower the\n" +
            "executive thereof to make temporary appointments until the people fill the\n" +
            "vacancies by election as the legislature may direct.\n" +
            "\n" +
            "This amendment shall not be so construed as to affect the election or term of\n" +
            "any Senator chosen before it becomes valid as part of the Constitution.\n" +
            "\n" +
            "Amendment 18\n" +
            "1. After one year from the ratification of this article the manufacture, sale,\n" +
            "or transportation of intoxicating liquors within, the importation thereof into,\n" +
            "or the exportation thereof from the United States and all territory subject to\n" +
            "the jurisdiction thereof for beverage purposes is hereby prohibited.\n" +
            "\n" +
            "2. The Congress and the several States shall have concurrent power to enforce\n" +
            "this article by appropriate legislation.\n" +
            "\n" +
            "3. This article shall be inoperative unless it shall have been ratified as an\n" +
            "amendment to the Constitution by the legislatures of the several States, as\n" +
            "provided in the Constitution, within seven years from the date of the\n" +
            "submission hereof to the States by the Congress.\n" +
            "\n" +
            "Amendment 19\n" +
            "The right of citizens of the United States to vote shall not be denied or\n" +
            "abridged by the United States or by any State on account of sex.\n" +
            "\n" +
            "Congress shall have power to enforce this article by appropriate legislation.\n" +
            "\n" +
            "Amendment 20\n" +
            "1. The terms of the President and Vice President shall end at noon on the 20th\n" +
            "day of January, and the terms of Senators and Representatives at noon on the 3d\n" +
            "day of January, of the years in which such terms would have ended if this\n" +
            "article had not been ratified; and the terms of their successors shall then\n" +
            "begin.\n" +
            "\n" +
            "2. The Congress shall assemble at least once in every year, and such meeting\n" +
            "shall begin at noon on the 3d day of January, unless they shall by law appoint\n" +
            "a different day.\n" +
            "\n" +
            "3. If, at the time fixed for the beginning of the term of the President, the\n" +
            "President elect shall have died, the Vice President elect shall become\n" +
            "President. If a President shall not have been chosen before the time fixed for\n" +
            "the beginning of his term, or if the President elect shall have failed to\n" +
            "qualify, then the Vice President elect shall act as President until a President\n" +
            "shall have qualified; and the Congress may by law provide for the case wherein\n" +
            "neither a President elect nor a Vice President elect shall have qualified,\n" +
            "declaring who shall then act as President, or the manner in which one who is to\n" +
            "act shall be selected, and such person shall act accordingly until a President\n" +
            "or Vice President shall have qualified.\n" +
            "\n" +
            "4. The Congress may by law provide for the case of the death of any of the\n" +
            "persons from whom the House of Representatives may choose a President whenever\n" +
            "the right of choice shall have devolved upon them, and for the case of the\n" +
            "death of any of the persons from whom the Senate may choose a Vice President\n" +
            "whenever the right of choice shall have devolved upon them.\n" +
            "\n" +
            "5. Sections 1 and 2 shall take effect on the 15th day of October following the\n" +
            "ratification of this article.\n" +
            "\n" +
            "6. This article shall be inoperative unless it shall have been ratified as an\n" +
            "amendment to the Constitution by the legislatures of three-fourths of the\n" +
            "several States within seven years from the date of its submission.\n" +
            "\n" +
            "Amendment 21\n" +
            "1. The eighteenth article of amendment to the Constitution of the United States\n" +
            "is hereby repealed.\n" +
            "\n" +
            "2. The transportation or importation into any State, Territory, or possession\n" +
            "of the United States for delivery or use therein of intoxicating liquors, in\n" +
            "violation of the laws thereof, is hereby prohibited.\n" +
            "\n" +
            "3. The article shall be inoperative unless it shall have been ratified as an\n" +
            "amendment to the Constitution by conventions in the several States, as provided\n" +
            "in the Constitution, within seven years from the date of the submission hereof\n" +
            "to the States by the Congress.\n" +
            "\n" +
            "Amendment 22\n" +
            "1. No person shall be elected to the office of the President more than twice,\n" +
            "and no person who has held the office of President, or acted as President, for\n" +
            "more than two years of a term to which some other person was elected President\n" +
            "shall be elected to the office of the President more than once. But this\n" +
            "Article shall not apply to any person holding the office of President, when this\n" +
            "Article was proposed by the Congress, and shall not prevent any person who may\n" +
            "be holding the office of President, or acting as President, during the term\n" +
            "within which this Article becomes operative from holding the office of\n" +
            "President or acting as President during the remainder of such term.\n" +
            "\n" +
            "2. This article shall be inoperative unless it shall have been ratified as an\n" +
            "amendment to the Constitution by the legislatures of three-fourths of the\n" +
            "several States within seven years from the date of its submission to the States\n" +
            "by the Congress.\n" +
            "\n" +
            "Amendment 23\n" +
            "1. The District constituting the seat of Government of the United States shall\n" +
            "appoint in such manner as the Congress may direct: A number of electors of\n" +
            "President and Vice President equal to the whole number of Senators and\n" +
            "Representatives in Congress to which the District would be entitled if it were\n" +
            "a State, but in no event more than the least populous State; they shall be in\n" +
            "addition to those appointed by the States, but they shall be considered, for\n" +
            "the purposes of the election of President and Vice President, to be electors\n" +
            "appointed by a State; and they shall meet in the District and perform such\n" +
            "duties as provided by the twelfth article of amendment.\n" +
            "\n" +
            "2. The Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 24\n" +
            "1. The right of citizens of the United States to vote in any primary or other\n" +
            "election for President or Vice President, for electors for President or\n" +
            "Vice President, or for Senator or Representative in Congress, shall not be\n" +
            "denied or abridged by the United States or any State by reason of failure to\n" +
            "pay any poll tax or other tax.\n" +
            "\n" +
            "2. The Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 25\n" +
            "1. In case of the removal of the President from office or of his death or\n" +
            "resignation, the Vice President shall become President.\n" +
            "\n" +
            "2. Whenever there is a vacancy in the office of the Vice President, the\n" +
            "President shall nominate a Vice President who shall take office upon\n" +
            "confirmation by a majority vote of both Houses of Congress.\n" +
            "\n" +
            "3. Whenever the President transmits to the President pro tempore of the Senate\n" +
            "and the Speaker of the House of Representatives his written declaration that he\n" +
            "is unable to discharge the powers and duties of his office, and until he\n" +
            "transmits to them a written declaration to the contrary, such powers and duties\n" +
            "shall be discharged by the Vice President as Acting President.\n" +
            "\n" +
            "4. Whenever the Vice President and a majority of either the principal officers\n" +
            "of the executive departments or of such other body as Congress may by law\n" +
            "provide, transmit to the President pro tempore of the Senate and the Speaker of\n" +
            "the House of Representatives their written declaration that the President is\n" +
            "unable to discharge the powers and duties of his office, the Vice President\n" +
            "shall immediately assume the powers and duties of the office as Acting\n" +
            "President.\n" +
            "\n" +
            "Thereafter, when the President transmits to the President pro tempore of the\n" +
            "Senate and the Speaker of the House of Representatives his written declaration\n" +
            "that no inability exists, he shall resume the powers and duties of his office\n" +
            "unless the Vice President and a majority of either the principal officers of\n" +
            "the executive department or of such other body as Congress may by law provide,\n" +
            "transmit within four days to the President pro tempore of the Senate and the\n" +
            "Speaker of the House of Representatives their written declaration that the\n" +
            "President is unable to discharge the powers and duties of his office. Thereupon\n" +
            "Congress shall decide the issue, assembling within forty eight hours for that\n" +
            "purpose if not in session. If the Congress, within twenty one days after\n" +
            "receipt of the latter written declaration, or, if Congress is not in session,\n" +
            "within twenty one days after Congress is required to assemble, determines by\n" +
            "two thirds vote of both Houses that the President is unable to discharge the\n" +
            "powers and duties of his office, the Vice President shall continue to discharge\n" +
            "the same as Acting President; otherwise, the President shall resume the powers\n" +
            "and duties of his office.\n" +
            "\n" +
            "Amendment 26\n" +
            "1. The right of citizens of the United States, who are eighteen years of age or\n" +
            "older, to vote shall not be denied or abridged by the United States or by any\n" +
            "State on account of age.\n" +
            "Provided by USConstitution.net\n" +
            "------------------------------\n" +
            "\n" +
            "[Note: Repealed text is not noted in this version.  Spelling errors have been\n" +
            "corrected in this version.  For an uncorrected, annotated version of the\n" +
            "Constitution, visit http://www.usconstitution.net/const.html ]\n" +
            "\n" +
            "We the People of the United States, in Order to form a more perfect Union,\n" +
            "establish Justice, insure domestic Tranquility, provide for the common\n" +
            "defence, promote the general Welfare, and secure the Blessings of Liberty to\n" +
            "ourselves and our Posterity, do ordain and establish this Constitution for the\n" +
            "United States of America.\n" +
            "\n" +
            "Article 1.\n" +
            "\n" +
            "Section 1\n" +
            "All legislative Powers herein granted shall be vested in a Congress of the\n" +
            "United States, which shall consist of a Senate and House of Representatives.\n" +
            "\n" +
            "Section 2\n" +
            "The House of Representatives shall be composed of Members chosen every second\n" +
            "Year by the People of the several States, and the Electors in each State shall\n" +
            "have the Qualifications requisite for Electors of the most numerous Branch of\n" +
            "the State Legislature.\n" +
            "\n" +
            "No Person shall be a Representative who shall not have attained to the Age of\n" +
            "twenty five Years, and been seven Years a Citizen of the United States, and who\n" +
            "shall not, when elected, be an Inhabitant of that State in which he shall be\n" +
            "chosen.\n" +
            "\n" +
            "Representatives and direct Taxes shall be apportioned among the several States\n" +
            "which may be included within this Union, according to their respective Numbers,\n" +
            "which shall be determined by adding to the whole Number of free Persons,\n" +
            "including those bound to Service for a Term of Years, and excluding Indians not\n" +
            "taxed, three fifths of all other Persons.\n" +
            "\n" +
            "The actual Enumeration shall be made within three Years after the first Meeting\n" +
            "of the Congress of the United States, and within every subsequent Term of ten\n" +
            "Years, in such Manner as they shall by Law direct. The Number of\n" +
            "Representatives shall not exceed one for every thirty Thousand, but each State\n" +
            "shall have at Least one Representative; and until such enumeration shall be\n" +
            "made, the State of New Hampshire shall be entitled to choose three,\n" +
            "Massachusetts eight, Rhode Island and Providence Plantations one, Connecticut\n" +
            "five, New York six, New Jersey four, Pennsylvania eight, Delaware one, Maryland\n" +
            "six, Virginia ten, North Carolina five, South Carolina five and Georgia three.\n" +
            "\n" +
            "When vacancies happen in the Representation from any State, the Executive\n" +
            "Authority thereof shall issue Writs of Election to fill such Vacancies.\n" +
            "\n" +
            "The House of Representatives shall choose their Speaker and other Officers; and\n" +
            "shall have the sole Power of Impeachment.\n" +
            "\n" +
            "Section 3\n" +
            "The Senate of the United States shall be composed of two Senators from each\n" +
            "State, chosen by the Legislature thereof, for six Years; and each Senator shall\n" +
            "have one Vote.\n" +
            "\n" +
            "Immediately after they shall be assembled in Consequence of the first Election,\n" +
            "they shall be divided as equally as may be into three Classes. The Seats of the\n" +
            "Senators of the first Class shall be vacated at the Expiration of the second\n" +
            "Year, of the second Class at the Expiration of the fourth Year, and of the\n" +
            "third Class at the Expiration of the sixth Year, so that one third may be\n" +
            "chosen every second Year; and if Vacancies happen by Resignation, or otherwise,\n" +
            "during the Recess of the Legislature of any State, the Executive thereof may\n" +
            "make temporary Appointments until the next Meeting of the Legislature, which\n" +
            "shall then fill such Vacancies.\n" +
            "\n" +
            "No person shall be a Senator who shall not have attained to the Age of thirty\n" +
            "Years, and been nine Years a Citizen of the United States, and who shall not,\n" +
            "when elected, be an Inhabitant of that State for which he shall be chosen.\n" +
            "\n" +
            "The Vice President of the United States shall be President of the Senate, but\n" +
            "shall have no Vote, unless they be equally divided.\n" +
            "\n" +
            "The Senate shall choose their other Officers, and also a President pro tempore,\n" +
            "in the absence of the Vice President, or when he shall exercise the Office of\n" +
            "President of the United States.\n" +
            "\n" +
            "The Senate shall have the sole Power to try all Impeachments. When sitting for\n" +
            "that Purpose, they shall be on Oath or Affirmation. When the President of the\n" +
            "United States is tried, the Chief Justice shall preside: And no Person shall be\n" +
            "convicted without the Concurrence of two thirds of the Members present.\n" +
            "\n" +
            "Judgment in Cases of Impeachment shall not extend further than to removal from\n" +
            "Office, and disqualification to hold and enjoy any Office of honor, Trust or\n" +
            "Profit under the United States: but the Party convicted shall nevertheless be\n" +
            "liable and subject to Indictment, Trial, Judgment and Punishment, according to\n" +
            "Law.\n" +
            "\n" +
            "Section 4\n" +
            "The Times, Places and Manner of holding Elections for Senators and\n" +
            "Representatives, shall be prescribed in each State by the Legislature thereof;\n" +
            "but the Congress may at any time by Law make or alter such Regulations, except\n" +
            "as to the Place of Choosing Senators.\n" +
            "\n" +
            "The Congress shall assemble at least once in every Year, and such Meeting shall\n" +
            "be on the first Monday in December, unless they shall by Law appoint a\n" +
            "different Day.\n" +
            "\n" +
            "Section 5\n" +
            "Each House shall be the Judge of the Elections, Returns and Qualifications of\n" +
            "its own Members, and a Majority of each shall constitute a Quorum to do\n" +
            "Business; but a smaller number may adjourn from day to day, and may be\n" +
            "authorized to compel the Attendance of absent Members, in such Manner, and\n" +
            "under such Penalties as each House may provide.\n" +
            "\n" +
            "Each House may determine the Rules of its Proceedings, punish its Members for\n" +
            "disorderly Behavior, and, with the Concurrence of two-thirds, expel a Member.\n" +
            "\n" +
            "Each House shall keep a Journal of its Proceedings, and from time to time\n" +
            "publish the same, excepting such Parts as may in their Judgment require\n" +
            "Secrecy; and the Yeas and Nays of the Members of either House on any question\n" +
            "shall, at the Desire of one fifth of those Present, be entered on the Journal.\n" +
            "\n" +
            "Neither House, during the Session of Congress, shall, without the Consent of\n" +
            "the other, adjourn for more than three days, nor to any other Place than that\n" +
            "in which the two Houses shall be sitting.\n" +
            "\n" +
            "Section 6\n" +
            "The Senators and Representatives shall receive a Compensation for their\n" +
            "Services, to be ascertained by Law, and paid out of the Treasury of the United\n" +
            "States. They shall in all Cases, except Treason, Felony and Breach of the\n" +
            "Peace, be privileged from Arrest during their Attendance at the Session of\n" +
            "their respective Houses, and in going to and returning from the same; and for\n" +
            "any Speech or Debate in either House, they shall not be questioned in any other\n" +
            "Place.\n" +
            "\n" +
            "No Senator or Representative shall, during the Time for which he was elected,\n" +
            "be appointed to any civil Office under the Authority of the United States which\n" +
            "shall have been created, or the Emoluments whereof shall have been increased\n" +
            "during such time; and no Person holding any Office under the United States,\n" +
            "shall be a Member of either House during his Continuance in Office.\n" +
            "\n" +
            "\n" +
            "Section 7\n" +
            "All bills for raising Revenue shall originate in the House of Representatives;\n" +
            "but the Senate may propose or concur with Amendments as on other Bills.\n" +
            "\n" +
            "Every Bill which shall have passed the House of Representatives and the Senate,\n" +
            "shall, before it become a Law, be presented to the President of the United\n" +
            "States; If he approve he shall sign it, but if not he shall return it, with his\n" +
            "Objections to that House in which it shall have originated, who shall enter the\n" +
            "Objections at large on their Journal, and proceed to reconsider it. If after\n" +
            "such Reconsideration two thirds of that House shall agree to pass the Bill, it\n" +
            "shall be sent, together with the Objections, to the other House, by which it\n" +
            "shall likewise be reconsidered, and if approved by two thirds of that House, it\n" +
            "shall become a Law. But in all such Cases the Votes of both Houses shall be\n" +
            "determined by Yeas and Nays, and the Names of the Persons voting for and\n" +
            "against the Bill shall be entered on the Journal of each House respectively. If\n" +
            "any Bill shall not be returned by the President within ten Days (Sundays\n" +
            "excepted) after it shall have been presented to him, the Same shall be a Law,\n" +
            "in like Manner as if he had signed it, unless the Congress by their Adjournment\n" +
            "prevent its Return, in which Case it shall not be a Law.\n" +
            "\n" +
            "Every Order, Resolution, or Vote to which the Concurrence of the Senate and\n" +
            "House of Representatives may be necessary (except on a question of Adjournment)\n" +
            "shall be presented to the President of the United States; and before the Same\n" +
            "shall take Effect, shall be approved by him, or being disapproved by him, shall\n" +
            "be repassed by two thirds of the Senate and House of Representatives, according\n" +
            "to the Rules and Limitations prescribed in the Case of a Bill.\n" +
            "\n" +
            "\n" +
            "Section 8\n" +
            "The Congress shall have Power To lay and collect Taxes, Duties, Imposts and\n" +
            "Excises, to pay the Debts and provide for the common Defence and general\n" +
            "Welfare of the United States; but all Duties, Imposts and Excises shall be\n" +
            "uniform throughout the United States;\n" +
            "\n" +
            "To borrow money on the credit of the United States;\n" +
            "\n" +
            "To regulate Commerce with foreign Nations, and among the several States, and\n" +
            "with the Indian Tribes;\n" +
            "\n" +
            "To establish an uniform Rule of Naturalization, and uniform Laws on the subject\n" +
            "of Bankruptcies throughout the United States;\n" +
            "\n" +
            "To coin Money, regulate the Value thereof, and of foreign Coin, and fix the\n" +
            "Standard of Weights and Measures;\n" +
            "\n" +
            "To provide for the Punishment of counterfeiting the Securities and current Coin\n" +
            "of the United States;\n" +
            "\n" +
            "To establish Post Offices and Post Roads;\n" +
            "\n" +
            "To promote the Progress of Science and useful Arts, by securing for limited\n" +
            "Times to Authors and Inventors the exclusive Right to their respective Writings\n" +
            "and Discoveries;\n" +
            "\n" +
            "To constitute Tribunals inferior to the supreme Court;\n" +
            "\n" +
            "To define and punish Piracies and Felonies committed on the high Seas, and\n" +
            "Offenses against the Law of Nations;\n" +
            "\n" +
            "To declare War, grant Letters of Marque and Reprisal, and make Rules concerning\n" +
            "Captures on Land and Water;\n" +
            "\n" +
            "To raise and support Armies, but no Appropriation of Money to that Use shall be\n" +
            "for a longer Term than two Years;\n" +
            "\n" +
            "To provide and maintain a Navy;\n" +
            "\n" +
            "To make Rules for the Government and Regulation of the land and naval Forces;\n" +
            "\n" +
            "To provide for calling forth the Militia to execute the Laws of the Union,\n" +
            "suppress Insurrections and repel Invasions;\n" +
            "\n" +
            "To provide for organizing, arming, and disciplining, the Militia, and for\n" +
            "governing such Part of them as may be employed in the Service of the United\n" +
            "States, reserving to the States respectively, the Appointment of the Officers,\n" +
            "and the Authority of training the Militia according to the discipline\n" +
            "prescribed by Congress;\n" +
            "\n" +
            "To exercise exclusive Legislation in all Cases whatsoever, over such District\n" +
            "(not exceeding ten Miles square) as may, by Cession of particular States, and\n" +
            "the acceptance of Congress, become the Seat of the Government of the United\n" +
            "States, and to exercise like Authority over all Places purchased by the Consent\n" +
            "of the Legislature of the State in which the Same shall be, for the Erection of\n" +
            "Forts, Magazines, Arsenals, dock-Yards, and other needful Buildings; And\n" +
            "\n" +
            "To make all Laws which shall be necessary and proper for carrying into\n" +
            "Execution the foregoing Powers, and all other Powers vested by this\n" +
            "Constitution in the Government of the United States, or in any Department or\n" +
            "Officer thereof.\n" +
            "\n" +
            "Section 9\n" +
            "The Migration or Importation of such Persons as any of the States now existing\n" +
            "shall think proper to admit, shall not be prohibited by the Congress prior to\n" +
            "the Year one thousand eight hundred and eight, but a tax or duty may be imposed\n" +
            "on such Importation, not exceeding ten dollars for each Person.\n" +
            "\n" +
            "The privilege of the Writ of Habeas Corpus shall not be suspended, unless when\n" +
            "in Cases of Rebellion or Invasion the public Safety may require it.\n" +
            "\n" +
            "No Bill of Attainder or ex post facto Law shall be passed.\n" +
            "\n" +
            "No capitation, or other direct, Tax shall be laid, unless in Proportion to the\n" +
            "Census or Enumeration herein before directed to be taken.\n" +
            "\n" +
            "No Tax or Duty shall be laid on Articles exported from any State.\n" +
            "\n" +
            "No Preference shall be given by any Regulation of Commerce or Revenue to the\n" +
            "Ports of one State over those of another: nor shall Vessels bound to, or from,\n" +
            "one State, be obliged to enter, clear, or pay Duties in another.\n" +
            "\n" +
            "No Money shall be drawn from the Treasury, but in Consequence of Appropriations\n" +
            "made by Law; and a regular Statement and Account of the Receipts and\n" +
            "Expenditures of all public Money shall be published from time to time.\n" +
            "\n" +
            "No Title of Nobility shall be granted by the United States: And no Person\n" +
            "holding any Office of Profit or Trust under them, shall, without the Consent of\n" +
            "the Congress, accept of any present, Emolument, Office, or Title, of any kind\n" +
            "whatever, from any King, Prince or foreign State.\n" +
            "\n" +
            "Section 10\n" +
            "No State shall enter into any Treaty, Alliance, or Confederation; grant Letters\n" +
            "of Marque and Reprisal; coin Money; emit Bills of Credit; make any Thing but\n" +
            "gold and silver Coin a Tender in Payment of Debts; pass any Bill of Attainder,\n" +
            "ex post facto Law, or Law impairing the Obligation of Contracts, or grant any\n" +
            "Title of Nobility.\n" +
            "\n" +
            "No State shall, without the Consent of the Congress, lay any Imposts or Duties\n" +
            "on Imports or Exports, except what may be absolutely necessary for executing\n" +
            "its inspection Laws: and the net Produce of all Duties and Imposts, laid by\n" +
            "any State on Imports or Exports, shall be for the Use of the Treasury of the\n" +
            "United States; and all such Laws shall be subject to the Revision and Control\n" +
            "of the Congress.\n" +
            "\n" +
            "No State shall, without the Consent of Congress, lay any duty of Tonnage, keep\n" +
            "Troops, or Ships of War in time of Peace, enter into any Agreement or Compact\n" +
            "with another State, or with a foreign Power, or engage in War, unless actually\n" +
            "invaded, or in such imminent Danger as will not admit of delay.\n" +
            "\n" +
            "Article 2.\n" +
            "\n" +
            "Section 1\n" +
            "The executive Power shall be vested in a President of the United States of\n" +
            "America. He shall hold his Office during the Term of four Years, and, together\n" +
            "with the Vice-President chosen for the same Term, be elected, as follows:\n" +
            "\n" +
            "Each State shall appoint, in such Manner as the Legislature thereof may direct,\n" +
            "a Number of Electors, equal to the whole Number of Senators and Representatives\n" +
            "to which the State may be entitled in the Congress: but no Senator or\n" +
            "Representative, or Person holding an Office of Trust or Profit under the United\n" +
            "States, shall be appointed an Elector.\n" +
            "\n" +
            "The Electors shall meet in their respective States, and vote by Ballot for two\n" +
            "persons, of whom one at least shall not lie an Inhabitant of the same State\n" +
            "with themselves. And they shall make a List of all the Persons voted for, and\n" +
            "of the Number of Votes for each; which List they shall sign and certify, and\n" +
            "transmit sealed to the Seat of the Government of the United States, directed to\n" +
            "the President of the Senate. The President of the Senate shall, in the Presence\n" +
            "of the Senate and House of Representatives, open all the Certificates, and the\n" +
            "Votes shall then be counted. The Person having the greatest Number of Votes\n" +
            "shall be the President, if such Number be a Majority of the whole Number of\n" +
            "Electors appointed; and if there be more than one who have such Majority, and\n" +
            "have an equal Number of Votes, then the House of Representatives shall\n" +
            "immediately choose by Ballot one of them for President; and if no Person have a\n" +
            "Majority, then from the five highest on the List the said House shall in like\n" +
            "Manner choose the President. But in choosing the President, the Votes shall be\n" +
            "taken by States, the Representation from each State having one Vote; a quorum\n" +
            "for this Purpose shall consist of a Member or Members from two-thirds of the\n" +
            "States, and a Majority of all the States shall be necessary to a Choice. In\n" +
            "every Case, after the Choice of the President, the Person having the greatest\n" +
            "Number of Votes of the Electors shall be the Vice President. But if there\n" +
            "should remain two or more who have equal Votes, the Senate shall choose from\n" +
            "them by Ballot the Vice-President.\n" +
            "\n" +
            "The Congress may determine the Time of choosing the Electors, and the Day on\n" +
            "which they shall give their Votes; which Day shall be the same throughout the\n" +
            "United States.\n" +
            "\n" +
            "No person except a natural born Citizen, or a Citizen of the United States, at\n" +
            "the time of the Adoption of this Constitution, shall be eligible to the Office\n" +
            "of President; neither shall any Person be eligible to that Office who shall not\n" +
            "have attained to the Age of thirty-five Years, and been fourteen Years a\n" +
            "Resident within the United States.\n" +
            "\n" +
            "In Case of the Removal of the President from Office, or of his Death,\n" +
            "Resignation, or Inability to discharge the Powers and Duties of the said\n" +
            "Office, the same shall devolve on the Vice President, and the Congress may by\n" +
            "Law provide for the Case of Removal, Death, Resignation or Inability, both of\n" +
            "the President and Vice President, declaring what Officer shall then act as\n" +
            "President, and such Officer shall act accordingly, until the Disability be\n" +
            "removed, or a President shall be elected.\n" +
            "\n" +
            "The President shall, at stated Times, receive for his Services, a Compensation,\n" +
            "which shall neither be increased nor diminished during the Period for which he\n" +
            "shall have been elected, and he shall not receive within that Period any other\n" +
            "Emolument from the United States, or any of them.\n" +
            "\n" +
            "Before he enter on the Execution of his Office, he shall take the following\n" +
            "Oath or Affirmation:\n" +
            "\n" +
            "\"I do solemnly swear (or affirm) that I will faithfully execute the Office of\n" +
            "President of the United States, and will to the best of my Ability, preserve,\n" +
            "protect and defend the Constitution of the United States.\"\n" +
            "\n" +
            "Section 2\n" +
            "The President shall be Commander in Chief of the Army and Navy of the United\n" +
            "States, and of the Militia of the several States, when called into the actual\n" +
            "Service of the United States; he may require the Opinion, in writing, of the\n" +
            "principal Officer in each of the executive Departments, upon any subject\n" +
            "relating to the Duties of their respective Offices, and he shall have Power to\n" +
            "Grant Reprieves and Pardons for Offenses against the United States, except in\n" +
            "Cases of Impeachment.\n" +
            "\n" +
            "He shall have Power, by and with the Advice and Consent of the Senate, to make\n" +
            "Treaties, provided two thirds of the Senators present concur; and he shall\n" +
            "nominate, and by and with the Advice and Consent of the Senate, shall appoint\n" +
            "Ambassadors, other public Ministers and Consuls, Judges of the supreme Court,\n" +
            "and all other Officers of the United States, whose Appointments are not herein\n" +
            "otherwise provided for, and which shall be established by Law: but the Congress\n" +
            "may by Law vest the Appointment of such inferior Officers, as they think\n" +
            "proper, in the President alone, in the Courts of Law, or in the Heads of\n" +
            "Departments.\n" +
            "\n" +
            "The President shall have Power to fill up all Vacancies that may happen during\n" +
            "the Recess of the Senate, by granting Commissions which shall expire at the End\n" +
            "of their next Session.\n" +
            "\n" +
            "Section 3\n" +
            "He shall from time to time give to the Congress Information of the State of the\n" +
            "Union, and recommend to their Consideration such Measures as he shall judge\n" +
            "necessary and expedient; he may, on extraordinary Occasions, convene both\n" +
            "Houses, or either of them, and in Case of Disagreement between them, with\n" +
            "Respect to the Time of Adjournment, he may adjourn them to such Time as he\n" +
            "shall think proper; he shall receive Ambassadors and other public Ministers; he\n" +
            "shall take Care that the Laws be faithfully executed, and shall Commission all\n" +
            "the Officers of the United States.\n" +
            "\n" +
            "Section 4\n" +
            "The President, Vice President and all civil Officers of the United States,\n" +
            "shall be removed from Office on Impeachment for, and Conviction of, Treason,\n" +
            "Bribery, or other high Crimes and Misdemeanors.\n" +
            "\n" +
            "Article 3.\n" +
            "\n" +
            "Section 1\n" +
            "The judicial Power of the United States, shall be vested in one supreme Court,\n" +
            "and in such inferior Courts as the Congress may from time to time ordain and\n" +
            "establish. The Judges, both of the supreme and inferior Courts, shall hold\n" +
            "their Offices during good Behavior, and shall, at stated Times, receive for\n" +
            "their Services a Compensation which shall not be diminished during their\n" +
            "Continuance in Office.\n" +
            "\n" +
            "Section 2\n" +
            "The judicial Power shall extend to all Cases, in Law and Equity, arising under\n" +
            "this Constitution, the Laws of the United States, and Treaties made, or which\n" +
            "shall be made, under their Authority; to all Cases affecting Ambassadors, other\n" +
            "public Ministers and Consuls; to all Cases of admiralty and maritime\n" +
            "Jurisdiction; to Controversies to which the United States shall be a Party; to\n" +
            "Controversies between two or more States; between a State and Citizens of\n" +
            "another State; between Citizens of different States; between Citizens of the\n" +
            "same State claiming Lands under Grants of different States, and between a\n" +
            "State, or the Citizens thereof, and foreign States, Citizens or Subjects.\n" +
            "\n" +
            "In all Cases affecting Ambassadors, other public Ministers and Consuls, and\n" +
            "those in which a State shall be Party, the supreme Court shall have original\n" +
            "Jurisdiction. In all the other Cases before mentioned, the supreme Court shall\n" +
            "have appellate Jurisdiction, both as to Law and Fact, with such Exceptions, and\n" +
            "under such Regulations as the Congress shall make.\n" +
            "\n" +
            "The Trial of all Crimes, except in Cases of Impeachment, shall be by Jury; and\n" +
            "such Trial shall be held in the State where the said Crimes shall have been\n" +
            "committed; but when not committed within any State, the Trial shall be at such\n" +
            "Place or Places as the Congress may by Law have directed.\n" +
            "\n" +
            "Section 3\n" +
            "Treason against the United States, shall consist only in levying War against\n" +
            "them, or in adhering to their Enemies, giving them Aid and Comfort. No Person\n" +
            "shall be convicted of Treason unless on the Testimony of two Witnesses to the\n" +
            "same overt Act, or on Confession in open Court.\n" +
            "\n" +
            "The Congress shall have power to declare the Punishment of Treason, but no\n" +
            "Attainder of Treason shall work Corruption of Blood, or Forfeiture except\n" +
            "during the Life of the Person attainted.\n" +
            "\n" +
            "Article 4.\n" +
            "\n" +
            "Section 1\n" +
            "Full Faith and Credit shall be given in each State to the public Acts, Records,\n" +
            "and judicial Proceedings of every other State. And the Congress may by general\n" +
            "Laws prescribe the Manner in which such Acts, Records and Proceedings shall be\n" +
            "proved, and the Effect thereof.\n" +
            "\n" +
            "Section 2\n" +
            "The Citizens of each State shall be entitled to all Privileges and Immunities\n" +
            "of Citizens in the several States.\n" +
            "\n" +
            "A Person charged in any State with Treason, Felony, or other Crime, who shall\n" +
            "flee from Justice, and be found in another State, shall on demand of the\n" +
            "executive Authority of the State from which he fled, be delivered up, to be\n" +
            "removed to the State having Jurisdiction of the Crime.\n" +
            "\n" +
            "No Person held to Service or Labour in one State, under the Laws thereof,\n" +
            "escaping into another, shall, in Consequence of any Law or Regulation therein,\n" +
            "be discharged from such Service or Labour, But shall be delivered up on Claim\n" +
            "of the Party to whom such Service or Labour may be due.\n" +
            "\n" +
            "Section 3\n" +
            "New States may be admitted by the Congress into this Union; but no new States\n" +
            "shall be formed or erected within the Jurisdiction of any other State; nor any\n" +
            "State be formed by the Junction of two or more States, or parts of States,\n" +
            "without the Consent of the Legislatures of the States concerned as well as of\n" +
            "the Congress.\n" +
            "\n" +
            "The Congress shall have Power to dispose of and make all needful Rules and\n" +
            "Regulations respecting the Territory or other Property belonging to the United\n" +
            "States; and nothing in this Constitution shall be so construed as to Prejudice\n" +
            "any Claims of the United States, or of any particular State.\n" +
            "\n" +
            "Section 4\n" +
            "The United States shall guarantee to every State in this Union a Republican\n" +
            "Form of Government, and shall protect each of them against Invasion; and on\n" +
            "Application of the Legislature, or of the Executive (when the Legislature\n" +
            "cannot be convened) against domestic Violence.\n" +
            "\n" +
            "Article 5.\n" +
            "\n" +
            "The Congress, whenever two thirds of both Houses shall deem it necessary, shall\n" +
            "propose Amendments to this Constitution, or, on the Application of the\n" +
            "Legislatures of two thirds of the several States, shall call a Convention for\n" +
            "proposing Amendments, which, in either Case, shall be valid to all Intents and\n" +
            "Purposes, as part of this Constitution, when ratified by the Legislatures of\n" +
            "three fourths of the several States, or by Conventions in three fourths\n" +
            "thereof, as the one or the other Mode of Ratification may be proposed by the\n" +
            "Congress; Provided that no Amendment which may be made prior to the Year One\n" +
            "thousand eight hundred and eight shall in any Manner affect the first and\n" +
            "fourth Clauses in the Ninth Section of the first Article; and that no State,\n" +
            "without its Consent, shall be deprived of its equal Suffrage in the Senate.\n" +
            "\n" +
            "Article 6.\n" +
            "\n" +
            "All Debts contracted and Engagements entered into, before the Adoption of this\n" +
            "Constitution, shall be as valid against the United States under this\n" +
            "Constitution, as under the Confederation.\n" +
            "\n" +
            "This Constitution, and the Laws of the United States which shall be made in\n" +
            "Pursuance thereof; and all Treaties made, or which shall be made, under the\n" +
            "Authority of the United States, shall be the supreme Law of the Land; and the\n" +
            "Judges in every State shall be bound thereby, any Thing in the Constitution or\n" +
            "Laws of any State to the Contrary notwithstanding.\n" +
            "\n" +
            "The Senators and Representatives before mentioned, and the Members of the\n" +
            "several State Legislatures, and all executive and judicial Officers, both of\n" +
            "the United States and of the several States, shall be bound by Oath or\n" +
            "Affirmation, to support this Constitution; but no religious Test shall ever be\n" +
            "required as a Qualification to any Office or public Trust under the United\n" +
            "States.\n" +
            "\n" +
            "Article 7.\n" +
            "\n" +
            "The Ratification of the Conventions of nine States, shall be sufficient for the\n" +
            "Establishment of this Constitution between the States so ratifying the Same.\n" +
            "\n" +
            "Done in Convention by the Unanimous Consent of the States present the\n" +
            "Seventeenth Day of September in the Year of our Lord one thousand seven hundred\n" +
            "and Eighty seven and of the Independence of the United States of America the\n" +
            "Twelfth. In Witness whereof We have hereunto subscribed our Names.\n" +
            "\n" +
            "George Washington - President and deputy from Virginia\n" +
            "\n" +
            "New Hampshire - John Langdon, Nicholas Gilman\n" +
            "\n" +
            "Massachusetts - Nathaniel Gorham, Rufus King\n" +
            "\n" +
            "Connecticut - William Samuel Johnson, Roger Sherman\n" +
            "\n" +
            "New York - Alexander Hamilton\n" +
            "\n" +
            "New Jersey - William Livingston, David Brearley, William Paterson, Jonathan\n" +
            "Dayton\n" +
            "\n" +
            "Pennsylvania - Benjamin Franklin, Thomas Mifflin, Robert Morris, George Clymer,\n" +
            "Thomas Fitzsimons, Jared Ingersoll, James Wilson, Gouvernour Morris\n" +
            "\n" +
            "Delaware - George Read, Gunning Bedford Jr., John Dickinson, Richard Bassett,\n" +
            "Jacob Broom\n" +
            "\n" +
            "Maryland - James McHenry, Daniel of St Thomas Jenifer, Daniel Carroll\n" +
            "\n" +
            "Virginia - John Blair, James Madison Jr.\n" +
            "\n" +
            "North Carolina - William Blount, Richard Dobbs Spaight, Hugh Williamson\n" +
            "\n" +
            "South Carolina - John Rutledge, Charles Cotesworth Pinckney, Charles Pinckney,\n" +
            "Pierce Butler\n" +
            "\n" +
            "Georgia - William Few, Abraham Baldwin\n" +
            "\n" +
            "Attest: William Jackson, Secretary\n" +
            "\n" +
            "\n" +
            "Amendment 1\n" +
            "Congress shall make no law respecting an establishment of religion, or\n" +
            "prohibiting the free exercise thereof; or abridging the freedom of speech, or\n" +
            "of the press; or the right of the people peaceably to assemble, and to petition\n" +
            "the Government for a redress of grievances.\n" +
            "\n" +
            "Amendment 2\n" +
            "A well regulated Militia, being necessary to the security of a free State, the\n" +
            "right of the people to keep and bear Arms, shall not be infringed.\n" +
            "\n" +
            "Amendment 3\n" +
            "No Soldier shall, in time of peace be quartered in any house, without the\n" +
            "consent of the Owner, nor in time of war, but in a manner to be prescribed by\n" +
            "law.\n" +
            "\n" +
            "Amendment 4\n" +
            "The right of the people to be secure in their persons, houses, papers, and\n" +
            "effects, against unreasonable searches and seizures, shall not be violated, and\n" +
            "no Warrants shall issue, but upon probable cause, supported by Oath or\n" +
            "affirmation, and particularly describing the place to be searched, and the\n" +
            "persons or things to be seized.\n" +
            "\n" +
            "Amendment 5\n" +
            "No person shall be held to answer for a capital, or otherwise infamous crime,\n" +
            "unless on a presentment or indictment of a Grand Jury, except in cases arising\n" +
            "in the land or naval forces, or in the Militia, when in actual service in time\n" +
            "of War or public danger; nor shall any person be subject for the same offense\n" +
            "to be twice put in jeopardy of life or limb; nor shall be compelled in any\n" +
            "criminal case to be a witness against himself, nor be deprived of life,\n" +
            "liberty, or property, without due process of law; nor shall private property be\n" +
            "taken for public use, without just compensation.\n" +
            "\n" +
            "Amendment 6\n" +
            "In all criminal prosecutions, the accused shall enjoy the right to a speedy and\n" +
            "public trial, by an impartial jury of the State and district wherein the crime\n" +
            "shall have been committed, which district shall have been previously\n" +
            "ascertained by law, and to be informed of the nature and cause of the\n" +
            "accusation; to be confronted with the witnesses against him; to have compulsory\n" +
            "process for obtaining witnesses in his favor, and to have the Assistance of\n" +
            "Counsel for his defence.\n" +
            "\n" +
            "Amendment 7\n" +
            "In Suits at common law, where the value in controversy shall exceed twenty\n" +
            "dollars, the right of trial by jury shall be preserved, and no fact tried by a\n" +
            "jury, shall be otherwise re-examined in any Court of the United States, than\n" +
            "according to the rules of the common law.\n" +
            "\n" +
            "Amendment 8\n" +
            "Excessive bail shall not be required, nor excessive fines imposed, nor cruel\n" +
            "and unusual punishments inflicted.\n" +
            "\n" +
            "Amendment 9\n" +
            "The enumeration in the Constitution, of certain rights, shall not be construed\n" +
            "to deny or disparage others retained by the people.\n" +
            "\n" +
            "Amendment 10\n" +
            "The powers not delegated to the United States by the Constitution, nor\n" +
            "prohibited by it to the States, are reserved to the States respectively, or to\n" +
            "the people.\n" +
            "\n" +
            "Amendment 11\n" +
            "The Judicial power of the United States shall not be construed to extend to any\n" +
            "suit in law or equity, commenced or prosecuted against one of the United States\n" +
            "by Citizens of another State, or by Citizens or Subjects of any Foreign State.\n" +
            "\n" +
            "Amendment 12\n" +
            "The Electors shall meet in their respective states, and vote by ballot for\n" +
            "President and Vice-President, one of whom, at least, shall not be an inhabitant\n" +
            "of the same state with themselves; they shall name in their ballots the person\n" +
            "voted for as President, and in distinct ballots the person voted for as\n" +
            "Vice-President, and they shall make distinct lists of all persons voted for as\n" +
            "President, and of all persons voted for as Vice-President and of the number of\n" +
            "votes for each, which lists they shall sign and certify, and transmit sealed to\n" +
            "the seat of the government of the United States, directed to the President of\n" +
            "the Senate;\n" +
            "\n" +
            "The President of the Senate shall, in the presence of the Senate and House of\n" +
            "Representatives, open all the certificates and the votes shall then be counted;\n" +
            "\n" +
            "The person having the greatest Number of votes for President, shall be the\n" +
            "President, if such number be a majority of the whole number of Electors\n" +
            "appointed; and if no person have such majority, then from the persons having\n" +
            "the highest numbers not exceeding three on the list of those voted for as\n" +
            "President, the House of Representatives shall choose immediately, by ballot,\n" +
            "the President. But in choosing the President, the votes shall be taken by\n" +
            "states, the representation from each state having one vote; a quorum for this\n" +
            "purpose shall consist of a member or members from two-thirds of the states, and\n" +
            "a majority of all the states shall be necessary to a choice. And if the House\n" +
            "of Representatives shall not choose a President whenever the right of choice\n" +
            "shall devolve upon them, before the fourth day of March next following, then\n" +
            "the Vice-President shall act as President, as in the case of the death or other\n" +
            "constitutional disability of the President.\n" +
            "\n" +
            "The person having the greatest number of votes as Vice-President, shall be the\n" +
            "Vice-President, if such number be a majority of the whole number of Electors\n" +
            "appointed, and if no person have a majority, then from the two highest numbers\n" +
            "on the list, the Senate shall choose the Vice-President; a quorum for the\n" +
            "purpose shall consist of two-thirds of the whole number of Senators, and a\n" +
            "majority of the whole number shall be necessary to a choice. But no person\n" +
            "constitutionally ineligible to the office of President shall be eligible to\n" +
            "that of Vice-President of the United States.\n" +
            "\n" +
            "Amendment 13\n" +
            "1. Neither slavery nor involuntary servitude, except as a punishment for crime\n" +
            "whereof the party shall have been duly convicted, shall exist within the United\n" +
            "States, or any place subject to their jurisdiction.\n" +
            "\n" +
            "2. Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 14\n" +
            "1. All persons born or naturalized in the United States, and subject to the\n" +
            "jurisdiction thereof, are citizens of the United States and of the State\n" +
            "wherein they reside. No State shall make or enforce any law which shall abridge\n" +
            "the privileges or immunities of citizens of the United States; nor shall any\n" +
            "State deprive any person of life, liberty, or property, without due process of\n" +
            "law; nor deny to any person within its jurisdiction the equal protection of the\n" +
            "laws.\n" +
            "\n" +
            "2. Representatives shall be apportioned among the several States according to\n" +
            "their respective numbers, counting the whole number of persons in each State,\n" +
            "excluding Indians not taxed. But when the right to vote at any election for the\n" +
            "choice of electors for President and Vice-President of the United States,\n" +
            "Representatives in Congress, the Executive and Judicial officers of a State, or\n" +
            "the members of the Legislature thereof, is denied to any of the male\n" +
            "inhabitants of such State, being twenty-one years of age, and citizens of the\n" +
            "United States, or in any way abridged, except for participation in rebellion,\n" +
            "or other crime, the basis of representation therein shall be reduced in the\n" +
            "proportion which the number of such male citizens shall bear to the whole\n" +
            "number of male citizens twenty-one years of age in such State.\n" +
            "\n" +
            "3. No person shall be a Senator or Representative in Congress, or elector of\n" +
            "President and Vice-President, or hold any office, civil or military, under the\n" +
            "United States, or under any State, who, having previously taken an oath, as a\n" +
            "member of Congress, or as an officer of the United States, or as a member of\n" +
            "any State legislature, or as an executive or judicial officer of any State, to\n" +
            "support the Constitution of the United States, shall have engaged in\n" +
            "insurrection or rebellion against the same, or given aid or comfort to the\n" +
            "enemies thereof. But Congress may by a vote of two-thirds of each House, remove\n" +
            "such disability.\n" +
            "\n" +
            "4. The validity of the public debt of the United States, authorized by law,\n" +
            "including debts incurred for payment of pensions and bounties for services in\n" +
            "suppressing insurrection or rebellion, shall not be questioned. But neither the\n" +
            "United States nor any State shall assume or pay any debt or obligation incurred\n" +
            "in aid of insurrection or rebellion against the United States, or any claim for\n" +
            "the loss or emancipation of any slave; but all such debts, obligations and\n" +
            "claims shall be held illegal and void.\n" +
            "\n" +
            "5. The Congress shall have power to enforce, by appropriate legislation, the\n" +
            "provisions of this article.\n" +
            "\n" +
            "Amendment 15\n" +
            "1. The right of citizens of the United States to vote shall not be denied or\n" +
            "abridged by the United States or by any State on account of race, color, or\n" +
            "previous condition of servitude.\n" +
            "\n" +
            "2. The Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 16\n" +
            "The Congress shall have power to lay and collect taxes on incomes, from\n" +
            "whatever source derived, without apportionment among the several States, and\n" +
            "without regard to any census or enumeration.\n" +
            "\n" +
            "Amendment 17\n" +
            "The Senate of the United States shall be composed of two Senators from each\n" +
            "State, elected by the people thereof, for six years; and each Senator shall\n" +
            "have one vote. The electors in each State shall have the qualifications\n" +
            "requisite for electors of the most numerous branch of the State legislatures.\n" +
            "\n" +
            "When vacancies happen in the representation of any State in the Senate, the\n" +
            "executive authority of such State shall issue writs of election to fill such\n" +
            "vacancies: Provided, That the legislature of any State may empower the\n" +
            "executive thereof to make temporary appointments until the people fill the\n" +
            "vacancies by election as the legislature may direct.\n" +
            "\n" +
            "This amendment shall not be so construed as to affect the election or term of\n" +
            "any Senator chosen before it becomes valid as part of the Constitution.\n" +
            "\n" +
            "Amendment 18\n" +
            "1. After one year from the ratification of this article the manufacture, sale,\n" +
            "or transportation of intoxicating liquors within, the importation thereof into,\n" +
            "or the exportation thereof from the United States and all territory subject to\n" +
            "the jurisdiction thereof for beverage purposes is hereby prohibited.\n" +
            "\n" +
            "2. The Congress and the several States shall have concurrent power to enforce\n" +
            "this article by appropriate legislation.\n" +
            "\n" +
            "3. This article shall be inoperative unless it shall have been ratified as an\n" +
            "amendment to the Constitution by the legislatures of the several States, as\n" +
            "provided in the Constitution, within seven years from the date of the\n" +
            "submission hereof to the States by the Congress.\n" +
            "\n" +
            "Amendment 19\n" +
            "The right of citizens of the United States to vote shall not be denied or\n" +
            "abridged by the United States or by any State on account of sex.\n" +
            "\n" +
            "Congress shall have power to enforce this article by appropriate legislation.\n" +
            "\n" +
            "Amendment 20\n" +
            "1. The terms of the President and Vice President shall end at noon on the 20th\n" +
            "day of January, and the terms of Senators and Representatives at noon on the 3d\n" +
            "day of January, of the years in which such terms would have ended if this\n" +
            "article had not been ratified; and the terms of their successors shall then\n" +
            "begin.\n" +
            "\n" +
            "2. The Congress shall assemble at least once in every year, and such meeting\n" +
            "shall begin at noon on the 3d day of January, unless they shall by law appoint\n" +
            "a different day.\n" +
            "\n" +
            "3. If, at the time fixed for the beginning of the term of the President, the\n" +
            "President elect shall have died, the Vice President elect shall become\n" +
            "President. If a President shall not have been chosen before the time fixed for\n" +
            "the beginning of his term, or if the President elect shall have failed to\n" +
            "qualify, then the Vice President elect shall act as President until a President\n" +
            "shall have qualified; and the Congress may by law provide for the case wherein\n" +
            "neither a President elect nor a Vice President elect shall have qualified,\n" +
            "declaring who shall then act as President, or the manner in which one who is to\n" +
            "act shall be selected, and such person shall act accordingly until a President\n" +
            "or Vice President shall have qualified.\n" +
            "\n" +
            "4. The Congress may by law provide for the case of the death of any of the\n" +
            "persons from whom the House of Representatives may choose a President whenever\n" +
            "the right of choice shall have devolved upon them, and for the case of the\n" +
            "death of any of the persons from whom the Senate may choose a Vice President\n" +
            "whenever the right of choice shall have devolved upon them.\n" +
            "\n" +
            "5. Sections 1 and 2 shall take effect on the 15th day of October following the\n" +
            "ratification of this article.\n" +
            "\n" +
            "6. This article shall be inoperative unless it shall have been ratified as an\n" +
            "amendment to the Constitution by the legislatures of three-fourths of the\n" +
            "several States within seven years from the date of its submission.\n" +
            "\n" +
            "Amendment 21\n" +
            "1. The eighteenth article of amendment to the Constitution of the United States\n" +
            "is hereby repealed.\n" +
            "\n" +
            "2. The transportation or importation into any State, Territory, or possession\n" +
            "of the United States for delivery or use therein of intoxicating liquors, in\n" +
            "violation of the laws thereof, is hereby prohibited.\n" +
            "\n" +
            "3. The article shall be inoperative unless it shall have been ratified as an\n" +
            "amendment to the Constitution by conventions in the several States, as provided\n" +
            "in the Constitution, within seven years from the date of the submission hereof\n" +
            "to the States by the Congress.\n" +
            "\n" +
            "Amendment 22\n" +
            "1. No person shall be elected to the office of the President more than twice,\n" +
            "and no person who has held the office of President, or acted as President, for\n" +
            "more than two years of a term to which some other person was elected President\n" +
            "shall be elected to the office of the President more than once. But this\n" +
            "Article shall not apply to any person holding the office of President, when this\n" +
            "Article was proposed by the Congress, and shall not prevent any person who may\n" +
            "be holding the office of President, or acting as President, during the term\n" +
            "within which this Article becomes operative from holding the office of\n" +
            "President or acting as President during the remainder of such term.\n" +
            "\n" +
            "2. This article shall be inoperative unless it shall have been ratified as an\n" +
            "amendment to the Constitution by the legislatures of three-fourths of the\n" +
            "several States within seven years from the date of its submission to the States\n" +
            "by the Congress.\n" +
            "\n" +
            "Amendment 23\n" +
            "1. The District constituting the seat of Government of the United States shall\n" +
            "appoint in such manner as the Congress may direct: A number of electors of\n" +
            "President and Vice President equal to the whole number of Senators and\n" +
            "Representatives in Congress to which the District would be entitled if it were\n" +
            "a State, but in no event more than the least populous State; they shall be in\n" +
            "addition to those appointed by the States, but they shall be considered, for\n" +
            "the purposes of the election of President and Vice President, to be electors\n" +
            "appointed by a State; and they shall meet in the District and perform such\n" +
            "duties as provided by the twelfth article of amendment.\n" +
            "\n" +
            "2. The Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 24\n" +
            "1. The right of citizens of the United States to vote in any primary or other\n" +
            "election for President or Vice President, for electors for President or\n" +
            "Vice President, or for Senator or Representative in Congress, shall not be\n" +
            "denied or abridged by the United States or any State by reason of failure to\n" +
            "pay any poll tax or other tax.\n" +
            "\n" +
            "2. The Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 25\n" +
            "1. In case of the removal of the President from office or of his death or\n" +
            "resignation, the Vice President shall become President.\n" +
            "\n" +
            "2. Whenever there is a vacancy in the office of the Vice President, the\n" +
            "President shall nominate a Vice President who shall take office upon\n" +
            "confirmation by a majority vote of both Houses of Congress.\n" +
            "\n" +
            "3. Whenever the President transmits to the President pro tempore of the Senate\n" +
            "and the Speaker of the House of Representatives his written declaration that he\n" +
            "is unable to discharge the powers and duties of his office, and until he\n" +
            "transmits to them a written declaration to the contrary, such powers and duties\n" +
            "shall be discharged by the Vice President as Acting President.\n" +
            "\n" +
            "4. Whenever the Vice President and a majority of either the principal officers\n" +
            "of the executive departments or of such other body as Congress may by law\n" +
            "provide, transmit to the President pro tempore of the Senate and the Speaker of\n" +
            "the House of Representatives their written declaration that the President is\n" +
            "unable to discharge the powers and duties of his office, the Vice President\n" +
            "shall immediately assume the powers and duties of the office as Acting\n" +
            "President.\n" +
            "\n" +
            "Thereafter, when the President transmits to the President pro tempore of the\n" +
            "Senate and the Speaker of the House of Representatives his written declaration\n" +
            "that no inability exists, he shall resume the powers and duties of his office\n" +
            "unless the Vice President and a majority of either the principal officers of\n" +
            "the executive department or of such other body as Congress may by law provide,\n" +
            "transmit within four days to the President pro tempore of the Senate and the\n" +
            "Speaker of the House of Representatives their written declaration that the\n" +
            "President is unable to discharge the powers and duties of his office. Thereupon\n" +
            "Congress shall decide the issue, assembling within forty eight hours for that\n" +
            "purpose if not in session. If the Congress, within twenty one days after\n" +
            "receipt of the latter written declaration, or, if Congress is not in session,\n" +
            "within twenty one days after Congress is required to assemble, determines by\n" +
            "two thirds vote of both Houses that the President is unable to discharge the\n" +
            "powers and duties of his office, the Vice President shall continue to discharge\n" +
            "the same as Acting President; otherwise, the President shall resume the powers\n" +
            "and duties of his office.\n" +
            "\n" +
            "Amendment 26\n" +
            "1. The right of citizens of the United States, who are eighteen years of age or\n" +
            "older, to vote shall not be denied or abridged by the United States or by any\n" +
            "State on account of age.\n" +
            "\n" +
            "2. The Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 27\n" +
            "No law, varying the compensation for the services of the Senators and\n" +
            "Representatives, shall take effect, until an election of Representatives shall\n" +
            "have intervened.\n" +
            "2. The Congress shall have power to enforce this article by appropriate\n" +
            "legislation.\n" +
            "\n" +
            "Amendment 27\n" +
            "No law, varying the compensation for the services of the Senators and\n" +
            "Representatives, shall take effect, until an election of Representatives shall\n" +
            "have intervened.";*/
        return longComment;
    }

    @BeforeClass
    public static void oneTimeSetup(){
        //Set your path to the geckodriver application
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Before
    public void setup(){
        new SignInPage(driver)
                .open()
                .signinDefaultCredentials();
        new HeaderNavigation(driver)
                .clickProfileLink();
        new ProfilePage(driver)
                .clickPost();
    }

    @After
    public void teardown(){
        new HeaderNavigation(driver)
                .logout();
    }

    @AfterClass
    public static void oneTimeTeardown(){
        driver.quit();
    }

    @Test
    public void PostPage_SubmitValidComment_CommentPosted() {
        new PostPage(driver)
                .enterComment("This is a valid comment")
                .clickSubmitCommentButton();

        WebElement result = driver.findElement(By.cssSelector("div.dev-page-below-tabs > #gmi-CCommentMaster > #gmi-CCommentThread > #gmi-CComment > div.ch-ctrl > div.ctext.ch > div.ch-ctrl.cc-in > div.text.text-ii"));

        Assert.assertEquals("This is a valid comment", result.getText());

    }

    @Test
    public void PostPage_UserLoggedOut_ReturnLoginPage(){
        new HeaderNavigation(driver).logout();
        driver.get("http://cen4072-2.deviantart.com/art/Penguin-647149226");

        new PostPage(driver)
                .enterComment("This is a valid comment")
                .clickSubmitCommentButton();

        String result = driver.getCurrentUrl();

        Assert.assertEquals("http://cen4072-2.deviantart.com/art/Penguin-647149226", result);
    }

    @Test
    public void PostPage_PreviewValidCommentString_ShowPreview(){
        new PostPage(driver)
                .enterComment("This is a valid String")
                .clickPreviewButton();

        WebElement result = driver.findElement(By.cssSelector("div.previewbox-content > div.text"));

        Assert.assertEquals("This is a valid String", result.getText());

    }

    @Test
    public void PostPage_CloseCommentPreview_ReturnsCommentEdit(){

        new PostPage(driver)
                .enterComment("This is a valid String")
                .clickPreviewButton()
                .clickClosePreviewButton();

        WebElement result = driver.findElement(By.id("writer5622346056-writer"));

        Assert.assertEquals("This is a valid String", result.getText());
    }

    @Test
    public void PostPage_EditCommentFromPreview_ReturnsCommentEdit(){

        new PostPage(driver)
                .enterComment("This is a valid comment")
               .clickPreviewButton()
                .clickEditButton();

        WebElement result = driver.findElement(By.id("writer1502301462-writer"));
        Assert.assertEquals("This is a valid comment", result.getText());
    }

    @Test
    public void PostPage_VeryLongComment_ReturnErrorMessage(){

        String errorMessage = new PostPage(driver)
                .enterComment(comments())
                .clickSubmitCommentButton()
                .getErrorMessage();

        Assert.assertEquals("An error has occurred:\n" +
                "\n" +
                "Couldn't post the comment, since the system thinks it's spam.",errorMessage);
    }

    @Test // this test will fail because the comment errorernously posts
    public void PostPage_CommentContainsOnlyWhitespace_CommentDoseNotPost(){

        new PostPage(driver)
                .enterComment(" ")
                .clickSubmitCommentButton();

        WebElement result = driver.findElement(By.id("writer2239877833-writer"));
        Assert.assertEquals(" ", result);
    }

}