package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.R.drawable.icon

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val overlayBoxHeight = screenHeight * 0.75f

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.mobile_app_background),
            contentDescription = null,
            modifier = Modifier
                .width(406.dp)
                .height(256.dp),
            contentScale = ContentScale.FillBounds
        )

        // Overlay Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(overlayBoxHeight)
                .align(Alignment.BottomCenter)
                .background(Color(0xFF090011))
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 50.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(30.dp)) // Add some space at the top

                // Name
                Text(
                    text = "LOGIN",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 56.sp // Set the text size
                )

                Spacer(modifier = Modifier.height(16.dp)) // Space between items

                // Label for Email input
                Text(
                    text = "Your email",
                    color = Color.White,
                    fontSize = 16.sp, // Set the text size
                    fontWeight = FontWeight.W400, // Set the font weight to 400
                    modifier = Modifier
                        .fillMaxWidth() // Make sure it takes the full width
                        .padding(horizontal = 40.dp) // Align to the left by adding padding to both sides
                )

                Spacer(modifier = Modifier.height(10.dp))

                // Email input
                Box(
                    modifier = Modifier
                        .width(361.dp)
                        .height(51.dp)
                        .padding(horizontal = 16.dp) // Keep the original padding
                        .border(1.dp, Color.White, RoundedCornerShape(50.dp)) // Add white border with rounded corners
                ) {
                    BasicTextField(
                        value = "eg. martian@space.com", // Value of the text field
                        onValueChange = {}, // Change listener for the text field
                        textStyle = androidx.compose.ui.text.TextStyle(color = Color.White), // Text style for the text field
                        singleLine = true, // Ensure only one line is shown
                        modifier = Modifier
                            .fillMaxSize() // Ensure the text field fills the entire Box
                            .padding(start = 20.dp, top = 16.dp, end = 20.dp, bottom = 16.dp) // Add padding to align the text
                    )
                }

                Spacer(modifier = Modifier.height(40.dp)) // Space between items

                // Label for Password input
                Text(
                    text = "Your password",
                    color = Color.White,
                    fontSize = 16.sp, // Set the text size
                    fontWeight = FontWeight.W400, // Set the font weight to 400
                    modifier = Modifier
                        .fillMaxWidth() // Make sure it takes the full width
                        .padding(horizontal = 40.dp) // Align to the left by adding padding to both sides
                )
                Spacer(modifier = Modifier.height(10.dp))

                // Password input
                Box(
                    modifier = Modifier
                        .width(361.dp)
                        .height(51.dp)
                        .padding(horizontal = 16.dp) // Keep the original padding
                        .border(1.dp, Color.White, RoundedCornerShape(50.dp)) // Add white border with rounded corners
                ) {
                    BasicTextField(
                        value = "**********", // Value of the text field
                        onValueChange = {}, // Change listener for the text field
                        textStyle = androidx.compose.ui.text.TextStyle(color = Color.White), // Text style for the text field
                        singleLine = true, // Ensure only one line is shown
                        modifier = Modifier
                            .fillMaxSize() // Ensure the text field fills the entire Box
                            .padding(start = 20.dp, top = 16.dp, end = 20.dp, bottom = 16.dp) // Add padding to align the text
                    )
                }
                Spacer(modifier = Modifier.height(16.dp)) // Space between password field and texts

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween // Arrange children horizontally with space between them
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically // Center items vertically within the row
                    ) {
                        Checkbox(
                            checked = false,
                            onCheckedChange = {}
                        )
                        Text(
                            text = "Remember Me",
                            color = Color.White,
                            fontSize = 12.sp // Set the text size
                        )
                    }
                    Text(
                        text = "Forgot Password",
                        color = Color(0xFFF2994A),
                        fontSize = 12.sp, // Set the text size
                        modifier = Modifier.align(Alignment.CenterVertically) // Ensure vertical alignment
                    )
                }

                // Button
                Spacer(modifier = Modifier.height(40.dp)) // Space between items
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF7920C2) // Replace with your desired color
                    ),
                    modifier = Modifier
                        .width(311.dp) // Fixed width
                        .height(55.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .padding(horizontal = 16.dp) // Keep the original padding
                ) {
                    Text(
                        text = "Login",
                        style = androidx.compose.ui.text.TextStyle(color = Color.White),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp // Set the text size
                    )
                }

                Spacer(modifier = Modifier.height(40.dp)) // Space between items
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 50.dp),
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically // Center items vertically within the row
                    ) {
                        Text(
                            text = "Already have an account? ",
                            color = Color.White,
                            fontSize = 16.sp // Set the text size
                        )
                    }
                    Text(
                        text = "Sign Up",
                        color = Color(0xFFF2994A),
                        fontSize = 16.sp // Set the text size
                    )
                }
            }
        }

        // Circular image with overlapping
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter) // Align at the top center of the Box
                .offset(y = 160.dp) // Adjust this value to position the circle shape over the edge of the box
                .size(113.dp) // Set width and height to 113px
                .clip(CircleShape) // Clip the Box to a circle shape
                .background(Color(0xFFF2994A)) // Background color of the circle
            ,
            contentAlignment = Alignment.Center // Center the content within the Box
        ) {
            Icon(
                painter = painterResource(id = icon), // Replace with your icon resource
                contentDescription = null,
                modifier = Modifier
                    .size(78.dp),
                tint = Color.White // Tint the icon color if needed
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    MyApplicationTheme {
        LoginScreen()
    }
}